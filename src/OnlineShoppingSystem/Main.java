package OnlineShoppingSystem;

public class Main {
    public static void main(String[] args) {
        try {
            Product p1 = new Electronics("Telefon ", 500);
            Product p2 = new Clothing("Koynek", 50);

            Product[] list= { p1 , p2};

            Order order = new Order(list);
            double total = order.getTotalPrice();

            Order.OrderItem item = order.new OrderItem();
            System.out.println("---Sifaris detallari---");
            item.showItems();

            Payment payment = new CreditCardPayment();
            payment.pay(total);

            order.setStatus(OrderStatus.SHIPPED);
            order.displayStatus();




        }catch (OrderException e){
            System.out.println("xeta baş verdi:"+ e.getMessage());
        }
    }
}
