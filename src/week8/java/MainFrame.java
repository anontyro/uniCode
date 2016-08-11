/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.java;

import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 *
 * @author Alex
 */
public class MainFrame extends QuitableJFrame {

    public MainFrame() {
        super("MainFrame");
        this.setPreferredSize(new Dimension(300, 300));
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        
        GraphicPanel graphics = new GraphicPanel(); //build the graphics object
        CentrePanel centPane = new CentrePanel(graphics);
        this.getContentPane().add(centPane, BorderLayout.NORTH);
       // this.getContentPane().add(centPane, BorderLayout.SOUTH);
        this.getContentPane().add(graphics, BorderLayout.PAGE_END);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mainF = new MainFrame();
    }
    


}
