package Kitabxana2;

public class Main {
    public static void main(String[] args) {
        Kitabxana kit = new Kitabxana("Romeo & julietta","Shekspir",false, Janr.KOMEDI);

        try {
            kit.showInfo();
        }catch (Xeta e){
            System.out.println("\n Exception:"+ e.getMessage());
        }
    }
}
