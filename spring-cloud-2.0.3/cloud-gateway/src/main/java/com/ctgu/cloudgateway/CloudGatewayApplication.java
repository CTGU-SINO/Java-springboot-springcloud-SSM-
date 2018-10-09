package com.ctgu.cloudgateway;

import com.ctgu.cloudgateway.Filter.ElapsedFilter;
import com.ctgu.cloudgateway.Filter.Factory.ElapsedGatewayFilterFactory;
import com.ctgu.cloudgateway.Filter.RateLimit.RemoteAddrKeyResolver;
import com.ctgu.cloudgateway.Filter.RateLimitByCpuGatewayFilter;
import com.ctgu.cloudgateway.Filter.RateLimitByIpGatewayFilter;
import com.ctgu.cloudgateway.Filter.TokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

@SpringBootApplication
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

    @Bean
    public ElapsedFilter elapsedFilter(){
        return new ElapsedFilter();
    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

    @Bean
    public ElapsedGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new ElapsedGatewayFilterFactory();
    }

    @Bean(name = RemoteAddrKeyResolver.BEAN_NAME)
    public RemoteAddrKeyResolver remoteAddrKeyResolver() {
        return new RemoteAddrKeyResolver();
    }

    @Autowired
    private RateLimitByCpuGatewayFilter rateLimitByCpuGatewayFilter;

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        // @formatter:off
        return builder.routes()
                .route(r -> r.path("/fluent/eureka-consumer/**")
                        .filters(f -> f.stripPrefix(2)
                                .filter(new ElapsedFilter())
                                .addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                        .uri("lb://EUREKA-CONSUMER")
                        .order(0)
                        .id("fluent_customer_service")
                )
                .route(r -> r.path("/throttle/eureka-consumer/**")
                        .filters(f -> f.stripPrefix(2)
                                .filter(new RateLimitByIpGatewayFilter(10, 1, Duration.ofSeconds(1)))
                                .filter(rateLimitByCpuGatewayFilter))
                        .uri("lb://EUREKA-CONSUMER")
                        .order(1)
                        .id("throttle_customer_service")
                )
                .build();
        // @formatter:on
    }
}
