/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Alex
 */
public class CentrePanel extends JPanel implements ActionListener {

    private JTextField name;
    private JButton submit;
    private MainFrame mFrame;

    public CentrePanel(GraphicPanel gpanel) {
        //this.setPreferredSize(new Dimension(50, 50));

        this.setLayout(new GridLayout(2, 2));

        this.add(new JLabel("Name: "));
        this.add(name = new JTextField());

        this.add(submit = new JButton("Submit"));
        submit.addActionListener(event ->{gpanel.setName(name.getText()); gpanel.repaint();});
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
