/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package component;
import java.awt.*;
import javavegui.pencere2;
/**
 *
 * @author Dell
 */
public class Textareasinifi {
    
    public Textareasinifi(){
    
     TextArea ta1=new TextArea("",10,20);
     TextArea ta2=new TextArea("textarea\nyazi yazin",10,20,TextArea.SCROLLBARS_NONE);
     ta2.setFont(new Font("verdana",Font.ITALIC,15));
     ta2.setBackground(Color.BLACK);
     ta2.setBackground(Color.WHITE);
     
     TextArea ta3=new TextArea("degiştirilemeyen text area",10,15,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
     ta3.setEditable(false);
     
     TextArea ta4=new TextArea("müdahale edilemez text area",4,25,TextArea.SCROLLBARS_VERTICAL_ONLY);
     ta4.setEditable(false);
     
   
     pencere2 pencere=new pencere2("text area testi");
     pencere.add(ta1);
     pencere.add(ta2);
     pencere.add(ta3);
     pencere.add(ta4);
     pencere.setVisible(true);
    }  
    
    public static void main(String[] args){
    
    Textareasinifi tas=new Textareasinifi();
    
    }
    
}




