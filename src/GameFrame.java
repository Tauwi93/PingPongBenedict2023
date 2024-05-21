import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame() {
        panel = new GamePanel(); // Erstellt ein neues GamePanel-Objekt

        this.add(panel); // Fügt das GamePanel dem GameFrame hinzu
        this.setTitle("Pong Game"); // Setzt den Titel des GameFrames auf "Pong Game"
        this.setResizable(false); // Deaktiviert die Größenänderung des GameFrames
        this.setBackground(Color.black); // Setzt die Hintergrundfarbe des GameFrames auf Schwarz
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Beendet das Programm, wenn das GameFrame geschlossen wird
        this.pack(); // Passt die Größe des GameFrames an den Inhalt an
        this.setVisible(true); // Setzt das GameFrame auf sichtbar
        this.setLocationRelativeTo(null); // Zentriert das GameFrame auf dem Bildschirm
    }
}

