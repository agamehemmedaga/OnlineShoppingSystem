package BankSistemi;

public class Main {
    public static void main(String[] args) {
Bankaccount account = new Bankaccount(500);
ATM atm = new ATM();
    try{
        System.out.println("---emeliyyat baslandi---");

        atm.withdraw(account, 500);
        atm.withdraw(account,200);
    } catch
    (Exceptionss e) {
        System.out.println(e.getMessage());
    }finally {
        System.out.println("---emeliyyat sona catdi");
    }




    }


}
