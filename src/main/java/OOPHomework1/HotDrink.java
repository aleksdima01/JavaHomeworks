package OOPHomework1;

public class HotDrink extends BottleOfWater {
    private Integer temp;

    public HotDrink(String name, Double cost, Double volume, Integer temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink: {" +
                "name='" + super.getName() + '\'' +
                ",cost='" + super.getCost() + '\'' +
                ",volume=" + super.getVolume() + '\'' +
                ",temperature=" + this.temp +
                '}';
    }
}
