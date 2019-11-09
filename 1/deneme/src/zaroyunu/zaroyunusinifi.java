/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zaroyunu;
 import java.util.Random;
/**
 *
 * @author Dell
 */
public class zaroyunusinifi {
    public static void main(String[] args){
    
    
    double rdsayi;
    Random rsayi=new Random();
    
    
    
    int sayi1;
    int sayi2;
    
    System.out.println("zarımız cevriliyor...");
    
    rdsayi=Math.random();
    
    
    rdsayi=rdsayi*6;
    
    sayi1=(int)(rdsayi+1);
    sayi2=(int)rsayi.nextInt(6)+1;
    
    System.out.println("["+sayi1+"]"+"["+sayi2+"]"+"geldi");
    
    }
}
