
package components;

import java.awt.*;
import javavegui.pencere2;





public class ButtonSinifi {
    
    public ButtonSinifi(){
        Button b1=new Button("Buton");
        Button b2=new Button();
        b2.setLabel("boş buton ");
        b2.setFont(new Font ("Timesroman",Font.ITALIC,15));
        Button b3=new Button("Butonn");
        b3.setEnabled(false);
        Button b4=new Button("Renkli Button");
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.red);
        
        pencere2 pencere=new pencere2 ("Buton Testi");
        pencere.add(b1);
        pencere.add(b2);
        pencere.add(b3);
        pencere.add(b4);
        pencere.setVisible(true);
    } 
    public static void main(String[]args){
    ButtonSinifi klm=new ButtonSinifi();
            
            }
}
