
package javavegui;
import java.awt.*;
import java.awt.event.*;

public class pencere2 extends Frame implements WindowListener{
     public pencere2(String baslık){
    
     super(baslık);
     setSize(400,300);
     setBackground(SystemColor.control);
     setLocation(200,150);
     setLayout(new FlowLayout());
     addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
       
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
 
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
     
}
