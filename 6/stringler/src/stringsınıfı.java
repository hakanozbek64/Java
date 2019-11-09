/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class stringsınıfı {
    
    
    
     public static void main(String[] args){
    
     String a="merhaBa";
     String b="nasılsınız?";
                     
       System.out.println(a+"javacılar"+b);            // yazdırma kodu
    
    char x=a.charAt(0); // harfleri yazdırmak için bir metod. 0 , 1. harftir
  
    
    System.out.println(x);
    
    System.out.println(a.replace("a", "u"));
    System.out.println(a.length());
    
    System.out.println(a.equals("merhaba"));
  
    System.out.println(a.endsWith("a"));
     
    System.out.println(a.toLowerCase());
    System.out.println(a.toUpperCase());
    System.out.println(a.substring(1));
    System.out.println(a.substring(0,3));
    System.out.println(a.indexOf("h"));
    
     String c="2.3f";
    
    System.out.println(c+3);
    
    System.out.println(Float.parseFloat(c)+3);
    
    
  
    Double m=3.33d;
    
    Integer s=m.intValue();
    
    System.out.println("ondalıklı sayının tam kısmını alıyoruz "+s);
    
    
    Float k=5.6f;
    
    Short z=k.shortValue();
            
    System.out.println("ondalıklı sayının tam kısmını alıyoruz "+z);
    
    Integer h=111;
    String f=h.toString();
    System.out.println(f+0000000);
    
   
    Integer l=16;// class tipinden ilkel tipe nasıl ceviriyoruz?
    
    int j=l.intValue();
    
    System.out.println(j);
    
    
    
            /*peki... ilkelden nasıl integere cevitiyoruz? burada ilkel tiplerin metodları 
    olmadıgı için veriri yapamıyoruz.*/
          
         
    
    }
    
    
}

    
