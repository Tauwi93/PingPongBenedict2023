import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle {

    int id;
    int yVelocity;
    int speed = 10;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e) {
        // Überprüft, welche Tasten gedrückt wurden und ändert die Y-Richtung entsprechend
        switch(id) {
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed); // Setzt die Y-Richtung auf nach oben (-speed)
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed); // Setzt die Y-Richtung auf nach unten (speed)
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed); // Setzt die Y-Richtung auf nach oben (-speed)
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed); // Setzt die Y-Richtung auf nach unten (speed)
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        // Überprüft, welche Tasten losgelassen wurden und setzt die Y-Richtung auf 0
        switch(id) {
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0); // Setzt die Y-Richtung auf 0 (keine Bewegung)
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0); // Setzt die Y-Richtung auf 0 (keine Bewegung)
                }
                break;
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection; // Setzt die Y-Geschwindigkeit auf die gegebene Richtung
    }

    public void move() {
        y = y + yVelocity; // Bewegt den Schläger in der Y-Richtung entsprechend der Y-Geschwindigkeit
    }

    public void draw(Graphics g) {
        // Zeichnet den Schläger mit einer Farbe basierend auf der ID
        if(id == 1)
            g.setColor(Color.green);
        else
            g.setColor(Color.yellow);
        g.fillRect(x, y, width, height); // Füllt ein Rechteck mit den gegebenen Koordinaten und Abmessungen
    }
}

