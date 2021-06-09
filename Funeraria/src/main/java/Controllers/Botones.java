
package Controllers;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;


public class Botones extends JFrame implements ActionListener {
    public static void main(String[] args) {
       
    }

    public Botones(String nombres, String apellidos, String nacimiento, String deceso) {
        Button boton = new Button("Guardar");
        
        
        
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    
  

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
