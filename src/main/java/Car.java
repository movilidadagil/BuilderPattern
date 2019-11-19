/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class Car implements IBuilder {

    private Product product = new Product();
    public void buildBody() {
        product.add("This is a body of a Car");
    }

    public void insertWheels() {
        product.add("4 wheels are added");

    }

    public void addHeadlights() {
        product.add("2 headlights are a Car");

    }

    public Product getVehicle() {
        return product;
    }
}
