package policy;

import java.util.ArrayList;
import java.util.List;

public class PolicyMain {

    public static void main(String[] args) {
        String type = "湖北";
        Hubei hubei = new Hubei();
        Hunan hunan = new Hunan();
        Jiangxi jiangxi = new Jiangxi();
        List<Province> list = new ArrayList<>();
        list.add(hubei);
        list.add(hunan);
        list.add(jiangxi);
        for(Province province : list){
            if(province.isMyJob(type)){
                province.doSomeThing(type);
            }
        }
    }
}
