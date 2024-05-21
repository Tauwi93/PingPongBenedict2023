import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();

        // Zufällige Richtung für die X-Komponente der Geschwindigkeit
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection * initialSpeed); // Setzt die X-Geschwindigkeit mit dem zufälligen Wert multipliziert mit der Anfangsgeschwindigkeit

        // Zufällige Richtung für die Y-Komponente der Geschwindigkeit
        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection * initialSpeed); // Setzt die Y-Geschwindigkeit mit dem zufälligen Wert multipliziert mit der Anfangsgeschwindigkeit
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity; // Bewegt den Ball in der X-Richtung entsprechend der X-Geschwindigkeit
        y += yVelocity; // Bewegt den Ball in der Y-Richtung entsprechend der Y-Geschwindigkeit
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width); // Füllt ein Oval mit den gegebenen Koordinaten und Abmessungen
    }
}
