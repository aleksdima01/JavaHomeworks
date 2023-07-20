package OOPHomework1;

import java.util.List;

//Текст задачи:
//        Реализуйте класс Товар, содержащий данные о товаре,
//        и ТорговыйАвтомат, содержащий в себе методы initProducts
//        (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;

    boolean addProduct(List<Product> productList);
}
