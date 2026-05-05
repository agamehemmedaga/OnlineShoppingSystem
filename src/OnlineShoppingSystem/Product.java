package OnlineShoppingSystem;

abstract class Product {
    String name;
    double price;


    public Product(String name, double price)throws OrderException {
        if(price<0){
            throw new OrderException("məhsulun qiyməti mənfi ola bilməz"+price);
        }
        this.name = name;
        this.price = price;

    }

    public abstract void showInfo();


        }


