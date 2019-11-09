/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;
import java.io.*;
/**
 *
 * @author Dell
 */
public class dowhile {
    public static void main(String[]args){
    
    BufferedReader oku;
    
    String cevap="saol";
    
    String sonuc;
    
    boolean dogru_cevap;
        
    oku=new BufferedReader(new InputStreamReader(System.in));  
        
        try 
        {
        do
        {
        System.out.println("bugun nasılsın?");
        
        sonuc=oku.readLine();
        
        if(!sonuc.equalsIgnoreCase(cevap))
        {
          dogru_cevap=false;  
            
          System.out.println("bugun nasılsın diye sordum . cevap ver!");
        }
        else
        {
        
        dogru_cevap=true;
        System.out.println("iyi olmana sevindim.");
        
        }
            
        }   
          
       while(!dogru_cevap);}
     
       catch(IOException hata) {}  
        
        
        
        }
        
   
    }
      

