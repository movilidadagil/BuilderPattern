/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class MotorCycle implements IBuilder {

    private Product product = new Product();
    public void buildBody() {
        product.add("this is a body of a Motorcycle");
    }

    public void insertWheels() {
        product.add("2 wheels are added");

    }

    public void addHeadlights() {
        product.add("1 headlights are added");

    }

    public Product getVehicle() {
        return product;
    }
}
