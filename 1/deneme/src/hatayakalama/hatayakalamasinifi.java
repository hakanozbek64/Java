/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hatayakalama;

import java.io.*;

/**
 *
 * @author Dell
 */
public class hatayakalamasinifi {
    
   public static void main(String[]args)
   {
   
   BufferedReader oku;
   
   boolean deger=false;
   
   int sayi=0;
   
   oku=new BufferedReader(new InputStreamReader(System.in)) ;
   
   do 
   {
   
   System.out.println("lütfen bir sayı giriniz.!!!");
   
   try{
   
   sayi=Integer.parseInt(oku.readLine());
   
   deger=true;
   }
   catch (NumberFormatException klm)
   {
   System.out.println("sadece sayı giriniz...");
   
   
   }catch(IOException opr)
   {
   
   }
   }while(!deger);
       
       System.out.println("yazdıgınız sayi:"+sayi);
       
   }
   
}


