/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme2;

/**
 *
 * @author Dell
 */
public class matematik_op_kacıs_metodları {
    
    public static void main(String[]args)
    {
    
        System.out.println("bugun istanbula\" gidelim");
        System.out.println("bugun hava cok sıcak\n 35 derece ");
        System.out.println("bugun hava cok sıcak\t 35 derece ");
        
        // matematik operatorleri:
        
        int x=10;
        float y=1.3f;
        double z=2.3333d;
        short t=5;
        System.out.println(x*y/z*t);
        System.out.println(x%y);// mutlak deger alıyoruz 
        
       int k;
        
        k=25;
        Float m=(float)k;// tür dönüşümü yapmış oluoruz.
        System.out.println(m);
                
        int sayi1=16;
        
        double sayi2=24.125d;
        
        int toplam= sayi1+(int)sayi2;
        System.out.println("sayiların toplami="+toplam );
    }
    
    
    
}
