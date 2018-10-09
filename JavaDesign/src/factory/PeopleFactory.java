package factory;


public class PeopleFactory {

    public People produce(String type){
        switch (type){
            case "hubei":
                return new HubeiPeople();
            case "hunan":
                return new HunanPeople();
            case "jiangxi":
                return new JiangxiPeople();
        }
        return null;
    }
}
