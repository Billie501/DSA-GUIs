
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
    
    
    Timer timer;
    
    int xVelocity =2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    int a = 200;
    int b = 200;
    int aVelocity = 3;
    int bVelocity = 1;
    
    
    MyPanel() {
        
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.white);
        enemy = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\vom.png").getImage();
        angel = new ImageIcon("C:\\Users\\billi\\OneDrive\\Documents\\NetBeansProjects\\GuiApps\\src\\angel.png").getImage();
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
        
        Rectangle enemyBounds = new Rectangle(x, y, enemy.getWidth(null), enemy.getHeight(null));
        Rectangle angelBounds = new Rectangle(a, b, angel.getWidth(null), angel.getHeight(null));
    
        if(enemyBounds.intersects(angelBounds)) {
            xVelocity = -xVelocity;
            yVelocity = -yVelocity;
            aVelocity = -aVelocity;
            bVelocity = -bVelocity;
        } 
        
        repaint();
    
    }
    
}
