import com.spring.config.MainConfig;
import com.spring.config.MainConfig2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class IOTest {

    @Test
    public void test1(){
        ApplicationContext cxt = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = cxt.getBeanDefinitionNames();
        for(String name:definitionNames){
            System.out.println(name);
        }
        System.out.println("IOC容器加载。。。");
        Object person1 = cxt.getBean("person");
        Object person2 = cxt.getBean("person");
        System.out.println(person1 == person2);
        Environment environment = cxt.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
    }
}
