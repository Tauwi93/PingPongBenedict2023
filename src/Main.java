import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    // Deklariere die Hauptelemente der Anwendung
    private JFrame mainFrame;
    private JButton startButton;
    private JButton exitButton;

    // Konstruktor der Hauptklasse
    public Main() {
        // Erstelle das Hauptfenster (JFrame) mit dem Titel "Spiel Hauptmenü"
        mainFrame = new JFrame("Spiel Hauptmenü");

        // Stelle sicher, dass das Programm beendet wird, wenn das Fenster geschlossen wird
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setze die Größe des Fensters auf 1280x800 Pixel
        mainFrame.setSize(1280, 800);

        // Setze das Layout-Manager auf null, um absolute Positionierung zu ermöglichen
        mainFrame.setLayout(null);

        // Erstelle die Buttons "Ping Pong Spiel starten" und "Spiel beenden"
        startButton = new JButton("Ping Pong Spiel starten");
        exitButton = new JButton("Spiel beenden");

        // Setze die Position und Größe der Buttons
        startButton.setBounds(500, 300, 300, 80);
        exitButton.setBounds(500, 400, 300, 80);

        // Füge Action Listener zu den Buttons hinzu, die darauf reagieren, wenn die Buttons geklickt werden
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Wenn der Start-Button geklickt wird, rufe die Methode startNewGame() auf
                startNewGame();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Wenn der Exit-Button geklickt wird, beende das Programm
                System.exit(0);
            }
        });

        // Füge die Buttons dem Hauptfenster hinzu
        mainFrame.add(startButton);
        mainFrame.add(exitButton);

        // Mache das Hauptfenster sichtbar
        mainFrame.setVisible(true);
    }

    // Methode zum Starten eines neuen Spiels
    public void startNewGame() {
        // Schließe das Hauptfenster
        mainFrame.dispose();

        // Gib eine Meldung aus, dass das Spiel gestartet wird
        System.out.println("Ping Pong Spiel wird gestartet...");

        // Erstelle ein neues GameFrame-Objekt, um das Ping-Pong-Spiel zu starten
        GameFrame frame = new GameFrame();
    }

    // Hauptmethode des Programms
    public static void main(String[] args) {
        // Verwende SwingUtilities.invokeLater(), um sicherzustellen, dass die GUI im Event-Dispatch-Thread erstellt wird
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Erstelle eine Instanz der Hauptklasse, um das Hauptmenü anzuzeigen
                new Main();
            }
        });
    }
}


