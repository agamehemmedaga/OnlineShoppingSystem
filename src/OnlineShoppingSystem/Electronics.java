package OnlineShoppingSystem;

public class Electronics extends  Product{
    public Electronics(String name , double price) throws OrderException{
        super(name , price);
    }

    @Override
    public void showInfo(){
        System.out.println("Electronics:"+name+" price:"+price);
    }

}
