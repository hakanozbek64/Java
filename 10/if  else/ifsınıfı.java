/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package if_ifadesı;

/**
 *
 * @author Dell
 */
public class ifsınıfı {
    
    
    public static void main(String args[])
    {
            /*burada zar atılarak tek yada cift oldunu yada 5in katı oldunu ögrenecegiz.*/
      int a=(int)(Math.random()*7);
      
              if (a%2==0){
              
              System.out.println(a+" sayi cift sayı gelmiştir.");
              
              }
              else if(a%5==0)
                      
                      {
                      
                      System.out.println(a+" sayi beşin katı gelmiştir.");
                      
                      }
             
              else 
              {
              System.out.println(a+" sayi tek sayı gelmiştir.");
              
              }
    
    
    }
}
