package OOPHomework2;

public class Human extends Actor {


    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    public void setMakeOrder(boolean status) {
        isMakeOrder = status;
    }

    @Override
    public void setTakeOrder(boolean status) {
        isTakeOrder = status;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
