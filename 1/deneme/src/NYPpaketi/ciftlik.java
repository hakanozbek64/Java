/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NYPpaketi;

/**
 *
 * @author Dell
 */
public class ciftlik {
    
    public static void main(String cem[])// cem yerine args de yazılabilir.köşeli parentez son kısma atılabilir.
    
    {
    
        ciftliksinifi ciftlikgiriş=new ciftliksinifi();
        ciftlikgiriş.ciftlikadi="HAKAN PAZARLAMA ÇİFTLİGİ";
        ciftlikgiriş.ciftliksahibi="hakan özbek";
        ciftlikgiriş.köpekler="köpek";
        ciftlikgiriş.inekler="inekler";
        ciftlikgiriş.tavuklar="tavuklar";
        ciftlikgiriş.inek=100;
        ciftlikgiriş.köpek=5;
        ciftlikgiriş.tavuk=27;
        
        
       
        String cb=ciftlikgiriş.ciftlikBilgisi();//cb : cftlik bilgisidir.ayrıca  return ile deger döndürelecek.
        String ch=ciftlikgiriş.ciftlikHayvanlari();
        ciftlikgiriş.tavuk=100;
        int chs=ciftlikgiriş.hayvanlarinSayisi();
        int chas=ciftlikgiriş.hayvanlarinAyakSayisi();
        int hsa=ciftliksinifi.hsayisi(); // ya 1. tarzda 
        
        System.out.println("Çiftlik Adı ve Çiftlik Sahibi:"+cb);
        System.out.println("Ciftlik Hayvanları:"+ch);
        System.out.println("Ciftlik Hayvanlarının Sayisi:"+chs );
        System.out.println("Ciftlik Hayvanları Ayak Sayisi:"+chas    );
        System.out.println("statik fonksiyon:"+hsa);//1. tarz yukardaki int hsa... ile  birlikte 
        System.out.println("satatik fonksiyon:"+ciftliksinifi.hsayisi());// yada  2. tarzda .yukardaki int hsa ... devam eden kısmı yazmıyoruz
        System.out.println("hayvanların sayisi:"+ciftliksinifi.hayvanlar(7, 17, 27));
     
    }
    
       
}
