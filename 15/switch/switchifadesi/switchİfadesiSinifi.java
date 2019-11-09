/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package switchifadesi;

/**
 *
 * @author Dell
 */
public class switchİfadesiSinifi {
    public static void main(String [] args){
    
    int a=(int)(Math.random()*4+1);
    
     int b=(int)(Math.random()*9+1);
    
        switch(a){
            case 1:
            System.out.println("bir");break;
            case 2:
            System.out.println("iki");break;    
            case 3:
            System.out.println("üç");break;
            case 4:
            System.out.println("dört");break;
            case 5:
            System.out.println("beş");break;    
        
        }
        
        switch (b){
            case 1:
               System.out.println("1, 10 nun bölenidir.");
               break;
            case 2:
               System.out.println("2, 10 nun bölenidir.");
               break;    
            case 5:
               System.out.println("5, 10 nun bölenidir.");
               break;        
            case 10:
               System.out.println("10, 10 nun bölenidir.");
               break;
            default:    
               System.out.println(a+" sayısı "+" 10 nun böleni degildir.");
             
                        
        }
        
       
    
    }
    
    
}
