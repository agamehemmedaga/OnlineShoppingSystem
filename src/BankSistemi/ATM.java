package BankSistemi;

public class ATM {
    public void deposit(Bankaccount account  , double amount){
        double newBalance = account.getBalance()+amount;
        account.setBalance(newBalance);
        System.out.println(amount+"AZN  medaxil olundu.  Cari balans:"+ newBalance+"AZN");
    }

    public void withdraw(Bankaccount  account , double amount) throws
        Exceptionss{

            if(amount>account.getBalance()){
                throw new
                        Exceptionss("xeta balansda kifayet qeder mebleq yoxdur  Cari balans:"+account.getBalance()+"AZN");
            }else {
                double newBalance = account.getBalance()-amount;

                account.setBalance(newBalance);
                System.out.println(amount+"AZN cixarildi. Cari balans:"+newBalance+"AZN");

            }
        }
    }



