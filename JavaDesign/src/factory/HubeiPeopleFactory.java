package factory;

public class HubeiPeopleFactory implements Factory {
    @Override
    public People produce() {
        return new HubeiPeople();
    }
}
