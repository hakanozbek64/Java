/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ForDongu;

/**
 *
 * @author Dell
 */
public class Fordizisi {
     public static void main(String [] args)
    {
    
    int [][] cd=new int[12][12]; 
        for(int i=1;i<=12;i++)
            
        {
       
           for(int j=1;j<=12;j++)
          
           {
               
           cd[i-1][j-1]=i*j;
           
           }
        }
           for(int i=0;i <cd.length;i++)
           {
           System.out.println('\n');
           
           
           for(int j=0;j<cd[i].length;j++)
               
           {
           System.out.print(cd[i][j]);
           
           }
       
        }
        
    
    }
    
}

    

