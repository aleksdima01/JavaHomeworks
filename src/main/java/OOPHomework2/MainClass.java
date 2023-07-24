package OOPHomework2;

public class MainClass {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Петя");
        Human human2 = new Human("Роман");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
}
