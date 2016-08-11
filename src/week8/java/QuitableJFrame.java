/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.java;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Alex
 */
public class QuitableJFrame extends JFrame implements WindowListener{
    
    public QuitableJFrame(String title, int xpixels, int ypixels){
        super(title);
        this.addWindowListener(this);
        if(xpixels > 0 && ypixels >0){
            this.setSize(xpixels, ypixels);
        }
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    public QuitableJFrame(String title){
        this(title,300,300);
    }
    
    public void quitOrCancel(){
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want"
                + "to exit?" + this.getTitle() + "?", "Exit program",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if(result == JOptionPane.YES_OPTION){
            System.exit(1);
        }
    }
    
    public void setLookAndFeel(String lookAndFeel){
        try{
            UIManager.setLookAndFeel(lookAndFeel);
            SwingUtilities.updateComponentTreeUI(this);
            this.validate();
            this.repaint();
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
            ex.getStackTrace();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.quitOrCancel();

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
