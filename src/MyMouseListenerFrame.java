
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author billi
 */
public class MyMouseListenerFrame extends JFrame implements MouseListener {
    
    JLabel label;
    ImageIcon cry;
    ImageIcon laugh;
    ImageIcon shocked;
    ImageIcon sleep;
    
    
    MyMouseListenerFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        //this.setLayout(new FlowLayout());
        
        label = new JLabel();
        label.addMouseListener(this);
        
        cry = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\cry.png");
        laugh = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\laugh.png");
        shocked = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\shocked.png");
        sleep = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\sleep.png");        
        
        label.setIcon(laugh);
        
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        
        
        //label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.blue);
        //label.setOpaque(true);
        
        
        //this.add(label);
        this.setVisible(true);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("You clicked the mouse");
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("You pressed the mouse");
        label.setIcon(sleep);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("You released the mouse");
        label.setIcon(cry);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("You entered the component/label");
        label.setIcon(shocked);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       System.out.println("You exited the component/label");
       label.setIcon(laugh);
    }
    
}
