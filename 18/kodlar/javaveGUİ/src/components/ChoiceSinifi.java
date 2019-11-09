



package components;

import java.awt.*;
import javavegui.pencere2;


public class ChoiceSinifi {
    public ChoiceSinifi(){
   Choice c1=new Choice(); 
   c1.add ("izmir"); 
   c1.add ("istanbul"); 
   c1.add ("uşak");
   Choice c2=new Choice();
   c2.add ("java"); 
   c2.add ("c++"); 
   c2.add ("linux");
   Choice c3=new Choice();
   c3.add ("bir"); 
   c3.add ("iki");
   c3.setFont(new Font("Timesroman",Font.PLAIN,15));
   c3.setBackground(Color.red);
   Choice c4=new Choice();
   c4.add("aktif degil");
   c4.add("seçim yapılamaz");
   c4.setEnabled(false);
   
   pencere2 pencere=new pencere2("choice testi");
   pencere.add(c1);
   pencere.add(c2);
   pencere.add(c3);
   pencere.add(c4);
   pencere.setVisible(true);
   
   
    }
    
    public static void main(String[]args){
   
        ChoiceSinifi hkl=new ChoiceSinifi();
    }
}



