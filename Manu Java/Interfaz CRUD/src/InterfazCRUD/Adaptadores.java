
package InterfazCRUD;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Adaptadores extends KeyAdapter{
    
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            e.consume(); // 
        }
    }
}

