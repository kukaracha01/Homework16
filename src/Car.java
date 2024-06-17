public class Car extends Transport {
    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
