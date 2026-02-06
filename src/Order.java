import java.util.Arrays;
import java.util.Objects;

public class Order {

    public String customer;

    public Product[] productBasket;



    public Order(String customer, Product[] productBasket) {
        this.customer = customer;
        this.productBasket = productBasket;

    }

    @Override
    public String toString() {
        return "заказчик = " + customer + " , продукты = " + Arrays.toString(this.productBasket);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return Objects.equals(customer, this.customer) && Arrays.equals(productBasket, this.productBasket);

    }

}