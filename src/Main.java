import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1234, "колбаса", 100, "мясо" );
        Product product2 = new Product(1234, "колбаса", 100, "мясо" );
        Product product3 = new Product(1233, "ветчина", 120, "мясо" );
        Product product4 = new Product(1222, "молоко", 40, "молочка" );
        Product product5 = new Product(1221, "кефир", 60, "молочка" );
        Product product6 = new Product(1220, "сыр", 100, "молочка" );
        System.out.println(product1.equals(product2));

        Product[] Product_Basket1 = {product1, product2, product3, product4};

        Product[] Product_Basket2 = {product1, product2, product3, product6};

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        Order order1 = new Order("Олег", Product_Basket1);
        System.out.println(order1);

        Order order2 = new Order("Иван", Product_Basket2);
        System.out.println(order2);
        System.out.println(Product_Basket1.equals(Product_Basket2));




    }
}