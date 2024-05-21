import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        // Zeichnet eine vertikale Linie in der Mitte des Spielfelds
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        // Zeichnet die Punktzahlen der Spieler
        g.drawString(String.valueOf(player1/10) + String.valueOf(player1%10), (GAME_WIDTH/2) - 85, 50); // Spieler 1 Punktzahl
        g.drawString(String.valueOf(player2/10) + String.valueOf(player2%10), (GAME_WIDTH/2) + 20, 50); // Spieler 2 Punktzahl

        // Überprüft, ob einer der Spieler die Punktzahl 10 erreicht hat
        if (player1 >= 10 || player2 >= 10) {
            // Schließt das Spiel
            System.exit(0);
        }
    }
}

