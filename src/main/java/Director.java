/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class Director {

    IBuilder myBuilder;

    public void construct(IBuilder builder){
        myBuilder=builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
