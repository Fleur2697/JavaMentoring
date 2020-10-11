package task3.orders;


//Задача:
//        Написати два методи, які будуть принімати замовлення в інтернет магазині і вовидити на екран список замовлень.
//        В одному методі реалізувати HashSet, в іншому TreeSet. Замовлення повинні поступати однакові і оброблютися по черзі
//        різними методами. В кінці вивести список усіх замовлень через HashSet та через TreeSet.
//        *Зробіть не менше 4 замовлень.


import java.util.HashSet;
import java.util.TreeSet;

public class OrdersMain {

    public static void main(String[] args) {
        Product product1 = new Product(20, "birds", "cockatiel");
        Product product2 = new Product(17, "cats", "siamese");
        Product product3 = new Product(12, "birds", "canaries");
        Product product4 = new Product(25, "cats", "bengal");
        Product product5 = new Product(22, "cats", "siberian");
        Product product6 = new Product(26, "cats", "turkish angora");

        OrderEntry orderEntry1 = new OrderEntry(2, product1);
        OrderEntry orderEntry2 = new OrderEntry(3, product2);
        OrderEntry orderEntry3 = new OrderEntry(2, product3);
        OrderEntry orderEntry4 = new OrderEntry(1, product4);
        OrderEntry orderEntry5 = new OrderEntry(4, product5);
        OrderEntry orderEntry6 = new OrderEntry(1, product6);

        Order order1 = new Order(1001);
        order1.addEntry(orderEntry1);
        order1.addEntry(orderEntry3);

        Order order2 = new Order(1002);
        order2.addEntry(orderEntry2);
        order2.addEntry(orderEntry4);
        order2.addEntry(orderEntry5);

        Order order3 = new Order(1003);
        order3.addEntry(orderEntry1);
        order3.addEntry(orderEntry2);
        order3.addEntry(orderEntry3);

        Order order4 = new Order(1004);
        order4.addEntry(orderEntry1);
        order4.addEntry(orderEntry3);
        order4.addEntry(orderEntry4);

        Order orderForPasha = new Order(1005);
        orderForPasha.addEntry(orderEntry6);

        OrdersMain.orderReturnHashSet(order1, order2, order3, order4, orderForPasha);
        OrdersMain.orderReturnTreeSet(order1, order2, order3, order4, orderForPasha);
    }

    public static void orderReturnHashSet(Order... orders) {
        HashSet<Order> ordersHashSet = new HashSet<>();
        for (Order or : orders) {
            ordersHashSet.add(or);
        }
        System.out.println(ordersHashSet);
    }


    public static void orderReturnTreeSet(Order... orders) {
        TreeSet<Order> ordersTreeSet = new TreeSet<>();
        for (Order or : orders) {
            ordersTreeSet.add(or);
        }
        System.out.println(ordersTreeSet);
    }
}