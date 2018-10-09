package policy;

public class Hubei implements Province {

    private static String type = "湖北";

    @Override
    public void doSomeThing(String inputType) {
        System.out.println("我是"+ inputType);
    }

    @Override
    public boolean isMyJob(String inputType) {
        return Hubei.type.equals(inputType);
    }
}
