
package components;

import java.awt.*;
import javavegui.pencere2;

public class TextFieldSinifi {
    public TextFieldSinifi(){
     
         TextField  tf1=new TextField();
         TextField tf2=new TextField(25);
         tf2.setText("bir şeyler yaz");
         tf2.setFont(new Font("Timesroman",Font.PLAIN,16));
         TextField tf3=new TextField("hiç bir müdahale yapılmaz",12);
         tf3.setEnabled(false);
         TextField tf4=new TextField();
         tf4.setEditable(false);
         TextField tf5=new TextField("RENKLİ");
         tf5.setForeground(Color.BLUE);
         tf5.setBackground(Color.GRAY);
         TextField tf6=new TextField("KULLANICI ADI",15);
         TextField tf7=new TextField("PAROLA",10);
         tf7.setEchoChar('*');
         
        pencere2 pencere=new pencere2 ("TEXT TEST");
        pencere.add(tf1);
        pencere.add(tf2);
        pencere.add(tf3);
        pencere.add(tf4);
        pencere.add(tf5);
        pencere.add(tf6);
        pencere.add(tf7);
        pencere.setVisible(true);
    } 
    public static void main(String[]args){
    TextFieldSinifi olm=new TextFieldSinifi();
    }
    
    
    
    
    
}
