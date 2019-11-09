/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package switchifadesi;
 import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Switch2 {
    public static void main(String [] args )
    {
    int sayi;
    Scanner oku=new Scanner(System.in);
    
    System.out.println("bir sayi giriniz :");
    
    sayi=oku.nextInt();// okunan degeri integere ceviriyor
    
    
    switch(sayi){
          case 1:
          System.out.println("bir girdiniz");break; 
          case 2:
          System.out.println("iki girdiniz");break;
          case 3:
          System.out.println("üç girdiniz");break;
          case 4:
          System.out.println("dört girdiniz");break;
          default:
          System.out.println("bu sayiyi kullanamazsınız...!");
     
    
    
    
    }
    
    }
    
    
}
