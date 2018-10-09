package policy;

public class Jiangxi implements Province {

    private static String type = "江西";

    @Override
    public void doSomeThing(String inputType) {
        System.out.println("我是"+ inputType);
    }

    @Override
    public boolean isMyJob(String inputType) {
        return Jiangxi.type.equals(inputType);
    }
}
