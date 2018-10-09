package AI;

import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    public void t(){
        ModelFactory factory = new ModelFactory();
        VGGModel modelFactory = (VGGModel) factory.produce("VGG");
        Net vGGNet = new Net("3*3", "2*2","4096");
        SessionConfig vGGSessionConfig = new SessionConfig("GPU1",1, true);
        Model model = new Model(vGGNet,"VGGModel","VGGModel.h5",vGGSessionConfig);
        Model VGGModel = modelFactory.createModel(model);
        System.out.println(VGGModel);
        VGGModel.predict();
        System.out.println(VGGModel.sessionConfig);
        vGGSessionConfig.setSessionStatus(true);
        VGGModel.setSessionConfig(vGGSessionConfig);
        System.out.println(VGGModel.checkSessionStatus());
    }
}
