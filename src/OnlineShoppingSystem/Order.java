package OnlineShoppingSystem;

public class Order {
    private Product[]products;
    private OrderStatus status;

    public Order(Product[]products){
        this.products = products;
        this.status = OrderStatus.PENDING;
    }

    class OrderItem{
        void showItems(){
            for (Product p : products){
                p.showInfo();
            }
        }
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getTotalPrice(){
        double total =0;
        for (Product p : products){
            total+=p.price;
        }
        return total;
    }


    public void displayStatus(){
        System.out.println("sifarişin cari statusu:"+status);
    }
}
