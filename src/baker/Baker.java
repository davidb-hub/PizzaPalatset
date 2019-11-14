package baker;

import view.BakerView;
import java.util.HashMap;
import javax.swing.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import view.MenyView;

public class Baker extends Thread {

    private BakerView bv = new BakerView();
    
    public Baker(JFrame frame) {
        bv.setVisible(true);
       int y =  frame.getY();
       int x = frame.getX();
       int width = frame.getWidth();
       
       bv.setLocation(x+width, y);
    }

    public Baker(int orderNr) {
    }
    
 
    
    public void makeOrder(String order){
        ProcessOrder po = new ProcessOrder(order);
        bv.addOrder(po);
    }
}
