package AI;

public class ModelFactory implements Factory {
    @Override
    public ModelBuild produce(String modelName) {
        switch (modelName){
            case "VGG":
                return new VGGModel();
            case "ResNet":
                return new ResNetModel();
        }
        return null;
    }
}
