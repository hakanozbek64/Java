/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomsayılar;
import java.util.Random;
/**
 *
 * @author Dell
 */
public class randomsınıfı {
    
    public static void main(String [] args)
    {
        /* 1. tip random sayı üretme*/
       double rsayi=Math.random(); //double tipinde olacak ve 0.0 ile 1.0 arasında olacak
       
       System.out.println("Random dapuble sayilarımız 0.0 ile 1.0 arasındadır.");
       System.out.println(rsayi);
       
       /*2. tip random sayi üretme*/
       //burada paketlerimizi ekliyoruz .import....ile//
       
       Random rsayim=new Random();
       
       System.out.println("random integer sayilar üretir.");
       System.out.println(rsayim.nextInt()+""+rsayim.nextInt()+""+rsayim.nextInt());
       
       /*limit koyarsak:*/
       
       int limit=15;
       
       System.out.println("random limitli  integer sayilar üretir.");
       System.out.println(rsayim.nextInt(limit)+" "+rsayim.nextInt(limit)+" "+rsayim.nextInt(limit));
       
       
       System.out.println("random float sayilar üretir.");
       System.out.println(rsayim.nextFloat()+" "+rsayim.nextFloat ()+" "+rsayim.nextFloat());
       
       
       System.out.println("random boolen üretir.");
       System.out.println(rsayim.nextBoolean()+" "+rsayim.nextBoolean()+" "+rsayim.nextBoolean());
       
      /*degerin degişmemesi için*/
               Random rsayim2=new Random(123);
              
       System.out.println("random limitli  integer sabit  sayilar üretir.");
       System.out.println(rsayim2.nextInt()+" "+rsayim2.nextInt()+" "+rsayim2.nextInt()); 
       
       /*setseed ile de sabitleyebiliriz.dikkat edersek limit aşagıya yazılmış oldu*/
       
       Random rsayim3=new Random();
       rsayim2.setSeed(123);
       
       
       System.out.println("random limitli  integer sabit  sayilar üretir.");
       System.out.println(rsayim3.nextInt()+" "+rsayim3.nextInt()+" "+rsayim3.nextInt()); 
    }

}