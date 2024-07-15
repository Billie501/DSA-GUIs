
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author billi
 */
public class MyKeyListenerFrame extends JFrame implements KeyListener{
    
    JLabel label;
    ImageIcon icon;
    
    MyKeyListenerFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1050,800);
        this.setLayout(null);
        this.addKeyListener(this);
        
        icon = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\burgercartoon.png");
        
        label = new JLabel();
        label.setBounds(0, 0, 150, 150);
        label.setIcon(icon);
        //label.setBackground(Color.blue);
        //label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped is invoked when a ke is typed. uses keyChar, char output
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;    
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //KeyPressed is envoked wheen a physical key is pressed down. uses KeyCode, int output
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;  
    }
  
    }     

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased is called whenever a button is released
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("You released key char: " +e.getKeyChar());
        System.out.println("You released key code: " +e.getKeyCode());
    }
    
}
