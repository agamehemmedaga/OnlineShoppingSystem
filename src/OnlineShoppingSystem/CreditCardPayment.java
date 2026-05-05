package OnlineShoppingSystem;

public class CreditCardPayment implements Payment {
    private double balance = 1150.0;
    @Override
    public void pay(double amount){
        if(amount<=balance) {
            balance -= amount;
            System.out.println(amount + "AZN məbləğində  ödəniş kartla uğurla tamamlandı");
            System.out.println("Cari balance:" + balance + "AZN");
        }else{
            System.out.println("xeta : Balansda  kifayetqeder mebleq yoxdur" );
        }
    }
}
