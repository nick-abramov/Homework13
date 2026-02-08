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
        return Objects.equals(customer, this.customer);
    }

        public static boolean areArraysEqual(Product[] array1, Product[] array2) {

            if (array1 == null && array2 == null) {
                return true;
            }

            if ((array1 == null) != (array2 == null)) {
                return false;
            }

            if (array1.length != array2.length) {
                return false;
            }

            for (int i = 0; i < array1.length; i++) {
                Product p1 = array1[i];
                Product p2 = array2[i];

                if (p1 == null && p2 != null ||
                        p1 != null && p2 == null ||
                        (p1 != null && !p1.equals(p2))) {
                    return false;
                }
            }
            return true;
        }


    }



