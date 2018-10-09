package policy;

public class Hunan implements Province {

    private static String type = "湖南";

    @Override
    public void doSomeThing(String inputType) {
        System.out.println("我是"+ inputType);
    }

    @Override
    public boolean isMyJob(String inputType) {
        return Hunan.type.equals(inputType);
    }
}
