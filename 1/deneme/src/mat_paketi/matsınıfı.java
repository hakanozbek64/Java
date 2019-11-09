/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mat_paketi;

/**
 *
 * @author Dell
 */
public class matsınıfı {
    
    public static void main (String [] args){
    
    double d=-123.123;
    
    System.out.println("sayımız"+d);
    System.out.println("sayımızın mutlak degeri : "+Math.abs(d));
    System.out.println("sayımızı yukarı yuverladık : "+Math.ceil(d));
    System.out.println("sayımızı aşagıya yuvarladık : "+Math.floor(d));
    System.out.println("sayımızın yakın oldugu bir sayıya yuvarladık : "+Math.round(d));
    
    System.out.println("100 ün karekökü :"+Math.sqrt(100));
    System.out.println("2 üzeri 3 : "+Math.pow(2, 3));
     System.out.println(" \n");
    
    /*random sayı aralıgını degiştirmek istersek:*/ 
    
    double r=Math.random()*45;
    System.out.println("sayımız:"+r);
    System.out.println(" \n");
    
    /*double tipindeki random sayısını int tipine ceviriyoruz  1 -11 arası int tipinde sayı üretiyor.*/
    
    int a=(int)(Math.random()*10+1);
    System.out.println(a);
    
    }
    
}
