
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author billi
 */
public class MyPanel extends JPanel implements ActionListener {
    
    final int PANEL_WIDTH = 800;
    final int PANEL_HEIGHT = 700;
    Image enemy;
    //Image backgroundImage;
    
    Image angel;
    
    Image sleep;
    
    Image laugh;
    
    Timer timer;
    
    int xVelocity =4;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    int a = 250;
    int b = 250;
    int aVelocity = 4;
    int bVelocity = 1;
    int c = 500;
    int d = 500;
    int cVelocity = 3;
    int dVelocity = 1;
    int laughE = 350;
    int laughF = 350;
    int laughEVelocity = -4;
    int laughFVelocity = 1;
    
    
    
    MyPanel() {
        
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.white);
        enemy = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\vom.png").getImage();
        angel = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\angel.png").getImage();
        sleep = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\sleep.png").getImage();
        laugh = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\laugh.png").getImage();
        //backgroundImage = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\beach.png").getImage();
        timer = new Timer(10, this);
        timer.start();
              
    }

    public void paint(Graphics g) {
        
        super.paint(g); //this paints back ground only
        
        Graphics g2D = (Graphics2D) g;
        
        //g2D.drawImage(backgroundImage,  0, 0, null);
        g2D.drawImage(enemy,  x, y, null);
        g2D.drawImage(angel,  a, b, null);
        g2D.drawImage(sleep,  c, d, null);
        g2D.drawImage(laugh,  laughE, laughF, null);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
       x += xVelocity;
        
        if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y += yVelocity;
        //repaint();
        
        if(a >= PANEL_WIDTH - angel.getWidth(null) || a < 0) {
            aVelocity = aVelocity * -1;
        }
        a += aVelocity;
        
        if(b >= PANEL_HEIGHT - angel.getHeight(null) || b < 0) {
            bVelocity = bVelocity * -1;
        }
        b += bVelocity;
        //repaint();
        if(c >= PANEL_WIDTH - sleep.getWidth(null) || c < 0) {
            cVelocity = cVelocity * -1;
        }
        c += cVelocity;
        
        if(d >= PANEL_HEIGHT - sleep.getHeight(null) || d < 0) {
            dVelocity = dVelocity * -1;
        }
        d += dVelocity;
        
        if(laughE >= PANEL_WIDTH - laugh.getWidth(null) || laughE < 0) {
            laughEVelocity = laughEVelocity * -1;
        }
        laughE += laughEVelocity;
        
        if(laughF >= PANEL_HEIGHT - laugh.getHeight(null) || laughF < 0) {
            laughFVelocity = laughFVelocity * -1;
        }
        laughF += laughFVelocity;
        
        Rectangle enemyBounds = new Rectangle(x, y, enemy.getWidth(null), enemy.getHeight(null));
        Rectangle angelBounds = new Rectangle(a, b, angel.getWidth(null), angel.getHeight(null));
        Rectangle sleepBounds = new Rectangle(c, d, sleep.getWidth(null), sleep.getHeight(null));
        Rectangle laughBounds = new Rectangle(laughE, laughF, laugh.getWidth(null), laugh.getHeight(null));
    
        if(enemyBounds.intersects(angelBounds)) {
            xVelocity = -xVelocity;
            yVelocity = -yVelocity;
            aVelocity = -aVelocity;
            bVelocity = -bVelocity;
            cVelocity = -cVelocity;
            dVelocity = -dVelocity;
            laughEVelocity = -laughEVelocity;
            laughFVelocity = -laughFVelocity;
        } 
        
        repaint();
    
    }
    
}
