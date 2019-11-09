/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package if_ifadesı;
import java.util.Random;
/**
 *
 * @author Dell
 */
public class sıcaklık_aralıkları {
    
    
    public static void main(String args[])
    
   {
   
      int min=-20;
      int max=45;
   
      int fark=max-min;
      
      int sicaklik;
      
      Random rsicaklik =new Random();
      
      sicaklik=rsicaklik.nextInt(fark+1)+min;
      
      
      if(sicaklik >30)
     {
      
      System.out.println(sicaklik+" aşiri sicak dikkat !!!");
      
     
     }
      else if(sicaklik <-10)
     {
      
      System.out.println(sicaklik+" dikkat buzlanma var !!!");
      
     
     }
      else if(sicaklik >0)
     {
      
      System.out.println(sicaklik+" hava soguk ");
      
     
     }
       else if(sicaklik <-10)
     {
      
      System.out.println("dikkat buzlanma var !!!");
      
     
     }
      
       else 
      {
      
      
      System.out.println("programımızda belirtmedigimiz  bir aralık ...");
      
      }
      
   }
    
}
