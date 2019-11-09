/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayler;

/**
 *
 * @author Dell
 */
public class arraylerSinifi {
    
    public static void main(String [] args){
        
        
        
        String [] dizi={"a","b","c","d","e"};
        System.out.println(dizi.length);
        dizi [1]="f";
        System.out.println(dizi[1]);
        dizi [1]="b";
        System.out.println(dizi[1]);
        System.out.println("çok boyutlu diziler:\n");
        
        String [][] cokboyutludizi=new String[5][5];
        cokboyutludizi[0][1]="cem";
        cokboyutludizi[1][2]="cem1";
        cokboyutludizi[2][3]="cem2";
        cokboyutludizi[3][4]="cem3";
        
        System.out.println(cokboyutludizi[0][1]);
        System.out.println(cokboyutludizi[1][2]);
        System.out.println(cokboyutludizi[2][3]);
        System.out.println(cokboyutludizi[3][4]);
     
        
        
    }
    
}
