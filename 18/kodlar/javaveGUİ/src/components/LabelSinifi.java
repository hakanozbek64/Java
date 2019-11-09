
package components;

import java.awt.*;
import javavegui.pencere2;


public class LabelSinifi {
    
    public LabelSinifi(){
    
    Label l1=new Label("LABEL");
    Label l2=new Label("İT'S A LABEL");
    
    l2.setFont(new Font("Timesroman",Font.BOLD,18));
    
    Label l3=new Label ();
    l3.setText("Ben Bir Gömülü Yazıyım.");
    l3.setEnabled(false);
    
    Label l4=new Label("ben renkli bir Labelim ve sag tarafa yaslı görünecegim",Label.RIGHT);
    l4.setBackground(Color.GREEN);
    l4.setForeground(Color.PINK);
    
    pencere2 pencere=new pencere2("label Testi");
    pencere.add(l1);
    pencere.add(l2);
    pencere.add(l3);
    pencere.add(l4);
    pencere.setVisible(true);
    }
    
    public static void main(String[] args){
    
    LabelSinifi lbls=new LabelSinifi();
    }
    
}
