package OnlineShoppingSystem;

public class Clothing extends Product {
    public Clothing(String name , double price)throws OrderException{
        super(name , price);
    }

    @Override
    public void showInfo(){
        System.out.println("Geyim:"+name+" Qiymet " + price);
    }
}
