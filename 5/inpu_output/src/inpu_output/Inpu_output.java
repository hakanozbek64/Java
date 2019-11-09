/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inpu_output;

import java.io.*;
/**
 *
 * @author Dell
 */
public class Inpu_output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       String ad;
        
        BufferedReader oku;
        
        oku=new BufferedReader(new InputStreamReader(System.in));
        
        
        yazı_yazma_sinifi.yaziyazmafonk("adiniz nedir:");
        
        
        try{
        ad=oku.readLine();
        
        yazı_yazma_sinifi.yaziyazmafonk("adiniz :"+ad+"dir!");
        }
        catch(IOException hata){
        
        yazı_yazma_sinifi.yaziyazmafonk("hata!");
        
        }
    }
    
    
}
