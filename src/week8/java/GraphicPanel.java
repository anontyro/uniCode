/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.java;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class GraphicPanel extends JPanel {

    private String name = "Alex Wilkinson";

    public GraphicPanel() {
        this.setPreferredSize(new Dimension(300, 100));

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setFont(new Font("Serif", Font.PLAIN, 20));

        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(getForeground());
        g.drawString("Hello my name is: "+name, 1, 20);

    }

    public void refresh() {
        this.repaint();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
