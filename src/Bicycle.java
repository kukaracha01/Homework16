public class Bicycle extends Transport {
    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void service() {
        super.service();
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }


}
