/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NYPpaketi;

/**
 *
 * @author Dell
 */
public class ciftliksinifi {
    
    
   String ciftlikadi;//property
   String ciftliksahibi;
   String köpekler;
   String inekler;
   String tavuklar;
   
   
   int köpek;
   int inek;
   int tavuk;
   
   String ciftlikBilgisi()
   
   {
   
   return ciftlikadi+" "+ciftliksahibi;
   
   }
   
   String ciftlikHayvanlari()
   {
   
       return  köpekler+" "+inekler+" "+tavuklar;
   
   }
   
   int hayvanlarinSayisi()
   {
   
   return köpek+inek+tavuk;
   
   }
   
   int hayvanlarinAyakSayisi()
   
   {
   
   return 4*köpek+4*inek+2*tavuk;
   
   }
   
   public static int hsayisi()
   {
   
   return 10+100+20;
   
   }
   
   public static int hayvanlar(int i,int k,int t)
   
   {
   
    return i+k+t;
   
   }
    
}
