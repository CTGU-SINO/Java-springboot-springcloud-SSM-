package factory;

public class HunanPeopleFactory implements Factory {
    @Override
    public People produce() {
        return new HunanPeople();
    }
}
