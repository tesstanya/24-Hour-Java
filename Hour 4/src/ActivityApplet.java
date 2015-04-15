import java.awt.*; 
 
public class ActivityApplet extends javax.swing.JApplet { 
    String x;  
    String y; 
    
    public void init() { 
        x = getParameter("string1"); 
        y = getParameter("string2"); 
    }
    
    public void paint(Graphics screen) { 
        screen.drawString("Parameter 1: " + x 
            + "\n" + "Parameter 2: " + y, 5, 50); 
    } 
} 