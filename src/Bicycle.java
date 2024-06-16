public class Bicycle extends Transport{
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void service() {
        updateTyre();
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }


}
