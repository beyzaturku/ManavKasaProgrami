package manavkasaprogramı;
import java.util.*;
public class ManavKasaProgramı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Armut kaç kilo?");
        int armutKilo = input.nextInt();
        double armutToplam = (armutKilo*2.14);
      
        System.out.println();
        
        System.out.print("Elma kaç kilo?");
        int elmaKilo = input.nextInt();
        double elmaToplam = (elmaKilo*3.67);
      
        
        System.out.println();
        
        System.out.print("Domates kaç kilo?");
        int domatesKilo = input.nextInt();
        double domatesToplam = (domatesKilo*1.11);
        
        
        System.out.println();
        
        System.out.print("Muz kaç kilo?");
        int muzKilo = input.nextInt();
        double muzToplam = (muzKilo*0.95);
       
        
        System.out.println();
        
        System.out.print("Patlıcan kaç kilo?");
        int patlıcanKilo = input.nextInt();
        double patlıcanToplam = (patlıcanKilo*5.00);
      
        System.out.println();
        double  toplam = (armutToplam+elmaToplam+domatesToplam+muzToplam+patlıcanToplam);
        System.out.println("Toplam tutar:" + toplam);
        
        
        
        
    }
    
}

