package OOPHomework1;


import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> products;


    public HotDrinkVendingMachine(List<HotDrink> products1) {
        this.products = products1;
    }


    public HotDrink getProduct(String name) {
        for (HotDrink product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, Double volume, Integer temperature) {

        for (HotDrink product : products) {
            if (product.getName().equalsIgnoreCase(name) && product.getVolume().equals(volume) && product.getTemp().equals(temperature))
                return product;
        }

        throw new IllegalStateException(String.format("Продукт c такими параметрами name=%s:volume=%.1f:temperature=%d не найден.", name, volume, temperature));

    }

    @Override
    public boolean addProduct(List<Product> productList) {
        if (products == null && productList == null) {
            return false;
        }
        for (Product item : productList) {
            products.add((HotDrink) item);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Аппарат с горячими напитками:" + products;
    }
}

