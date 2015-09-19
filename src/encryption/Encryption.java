/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author x
 */
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainplace mainpage = new mainplace();
        mainpage.setSize(500, 500);
        
        tool.centerWindow(mainpage);
        mainpage.setVisible(true);
    }
    
}
class  tool {
 public static void centerWindow(Window f){
//获得桌面大小
     Toolkit tk=f.getToolkit();
    Dimension dm=tk.getScreenSize();
f.setLocation((int)(dm.getWidth()-f.getWidth())/2,(int)(dm.getHeight()-f.getHeight())/2);
}
}
