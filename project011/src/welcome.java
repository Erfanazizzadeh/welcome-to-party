import javax.swing.*;
import java.util.Scanner;

public class welcome {

   static {
       scan = new Scanner(System.in);
   }


  // private  static String names [] = {"Zahrayaghi", "mohammadshaban","omid jahangir"};
   private  static Scanner scan;
   private  static String getName;
      public static void start(){
          System.out.println("Erfan Party ");
          System.out.println(" Enter your name: ");
          getName = scan.next();
          get_result(getName);

      }
      public static void get_result(String s){
          getName = s;
          switch (s) {// Im use switch instead for
              case "Zahrayaghi":
              case "Zahra_yaghi":
              case "ZahraYaghi":
              case "Mohammadshaban":
              case "MohammadShaban":
              case "Mohammad_shaban":
              case "Mohammad_Shaban":
              case "Erfanyousefi":
              case "Erfan_yousefi":
              case "Erfan_Yousefi":
              case "ErfanYousefi":
//                  System.out.println(" your Welcome to the party :))\n");
                  JOptionPane.showMessageDialog(null," Your welcome to the party :)","ErfanParty",JOptionPane.PLAIN_MESSAGE);
                  start();
                  break;
              default:
                  System.out.println("your name is Invalid :(\n");
                  start();
                  break;
           }
          }
    public static void main(String[] args) {
        start();
    }
}
