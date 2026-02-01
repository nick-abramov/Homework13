import java.util.Arrays;
import java.util.Objects;

public class Order {


    public Order(String customer, Product[] Product_Basket) {
        this.customer = customer;
        this.Product_Basket = Product_Basket;

    }

    public String customer;

    public Product[] Product_Basket;


    @Override
    public String toString() {
        return "заказчик = " + customer + " , продукты = " + Arrays.toString(this.Product_Basket);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return this.customer == ((Order) o).customer && Arrays.equals(Product_Basket, this.Product_Basket);
    }

}