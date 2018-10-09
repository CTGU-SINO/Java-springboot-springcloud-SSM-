package factory;

public class FactoryMain {

    public static void main(String[] args) {
//        PeopleFactory peopleFactory = new PeopleFactory();
//        People people = peopleFactory.produce("hunan");
//        people.eat();
        HubeiPeopleFactory hubeiPeopleFactory = new HubeiPeopleFactory();
        People people = hubeiPeopleFactory.produce();
        people.eat();
    }
}
