/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whiledowhile;

/**
 *
 * @author Dell
 */
public class whiledowhile {
    public static void main (String args[]){
    
    String [] sehirler={"istanbul","ankara","izmir","uşak","banaz"};
    boolean sehir=false;
    int sıra=0;
   
    System.out.println("izmir'in sırasını ver...");
    
    while(!sehir)
    {
    sehir=sehirler[sıra]=="izmir";
    
    if(!sehir)
    {
    
    System.out.println(sıra+".degil");
    
    sıra++;
    
    }
    else
    {
      System.out.println(sıra+".sırada");  
        
        
        
        
    
    }
    
    
    
    }
    
    
    
    
    
   }
}
