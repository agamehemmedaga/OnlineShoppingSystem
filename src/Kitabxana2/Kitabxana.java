package Kitabxana2;

public class Kitabxana {
    String name;
    String author;
    boolean available;
    public  Janr janr;


    public Kitabxana(String name, String author , boolean available , Janr janr){
        this.name = name;
        this.author = author;
        this.available = available;
        this.janr = janr;
    }

    public void showInfo() throws Xeta{
        if(available== false){
            System.out.println("kitab"+name+"author"+author+"available"+"janr"+janr);
            throw new Xeta("kitab stokta yoxdur");
        }
    }
}
