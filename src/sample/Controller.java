package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import javax.swing.text.html.ImageView;
import java.awt.*;


public class Controller {
    private String symbol;
    public Button field00, field01, field02, field10, field11, field12, field20, field21, field22, playAgain;
    private ImageView image00;
    public Label player1Score, player2Score, who;
    private String p1 = " ";
    private String p2 = " ";
    private int pl1 = 0;
    private int pl2 = 0;
    private int i = 1;
    private int score1 = 0;
    private int score2 = 0;
    private static String table[][] = {{" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}};

    @FXML
    Label labelWinner;

    @FXML
    void onField00Click() {

        game();
        field00.setText(symbol);
        table[0][0] = symbol;
        field00.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField01Click() {

        game();
        field01.setText(symbol);
        table[0][1] = symbol;
        field01.setDisable(true);
        checkWinner();

    }

    @FXML
    void onField02Click() {

        game();
        field02.setText(symbol);
        table[0][2] = symbol;
        field02.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField10Click() {

        game();
        field10.setText(symbol);
        table[1][0] = symbol;
        field10.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField11Click() {

        game();
        field11.setText(symbol);
        table[1][1] = symbol;
        field11.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField12Click() {

        game();
        field12.setText(symbol);
        table[1][2] = symbol;
        field12.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField20Click() {

        game();
        field20.setText(symbol);
        table[2][0] = symbol;
        field20.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField21Click() {

        game();
        field21.setText(symbol);
        table[2][1] = symbol;
        field21.setDisable(true);
        checkWinner();
    }

    @FXML
    void onField22Click() {

        game();
        field22.setText(symbol);
        table[2][2] = symbol;
        field22.setDisable(true);
        checkWinner();
    }

    @FXML
    public void onPlayAgainClick() {
        table[0][0] = " ";
        field00.setText(" ");
        field00.setDisable(false);
        table[0][1] = " ";
        field01.setText(" ");
        field01.setDisable(false);
        table[0][2] = " ";
        field02.setText(" ");
        field02.setDisable(false);
        table[1][0] = " ";
        field10.setText(" ");
        field10.setDisable(false);
        table[1][1] = " ";
        field11.setText(" ");
        field11.setDisable(false);
        table[1][2] = " ";
        field12.setText(" ");
        field12.setDisable(false);
        table[2][0] = " ";
        field20.setText(" ");
        field20.setDisable(false);
        table[2][1] = " ";
        field21.setText(" ");
        field21.setDisable(false);
        table[2][2] = " ";
        field22.setText(" ");
        field22.setDisable(false);
        labelWinner.setText(" ");
    }

    @FXML
    public void onKeyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case DIGIT1:
                onField00Click();
                break;
            case DIGIT2:
                onField01Click();
                break;
            case DIGIT3:
                onField02Click();
                break;
            case DIGIT4:
                onField10Click();
                break;
            case DIGIT5:
                onField11Click();
                break;
            case DIGIT6:
                onField12Click();
                break;
            case DIGIT7:
                onField20Click();
                break;
            case DIGIT8:
                onField21Click();
                break;
            case DIGIT9:
                onField22Click();
                break;
            default:
                System.out.println("In progress");
                break;

        }
        System.out.println(keyEvent.getCode());
    }

    public void game() {

        if (i % 2 == 0) {
            symbol = "X";
            i++;
            who.setText("O");
        } else if (i % 2 != 0) {
            symbol = "O";
            i++;
            who.setText("X");
        }
    }

    public void checkWinner() {
        if (table[0][0].equals("X") && table[0][1].equals("X") && table[0][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
//            playAgain.setText(p1);
            addPointPlayer1();

        }
        if (table[1][0].equals("X") && table[1][1].equals("X") && table[1][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[2][0].equals("X") && table[2][1].equals("X") && table[2][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[0][0].equals("X") && table[1][0].equals("X") && table[2][0].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[0][1].equals("X") && table[1][1].equals("X") && table[2][1].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[0][2].equals("X") && table[1][2].equals("X") && table[2][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[0][0].equals("X") && table[1][1].equals("X") && table[2][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[0][0].equals("X") && table[0][1].equals("X") && table[0][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[2][0].equals("X") && table[1][1].equals("X") && table[0][2].equals("X")) {
            labelWinner.setText("Winner is X");
            disableAll();
            addPointPlayer1();
        }
        if (table[0][0].equals("O") && table[0][1].equals("O") && table[0][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[1][0].equals("O") && table[1][1].equals("O") && table[1][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[2][0].equals("O") && table[2][1].equals("O") && table[2][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[0][0].equals("O") && table[1][0].equals("O") && table[2][0].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[0][1].equals("O") && table[1][1].equals("O") && table[2][1].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[0][2].equals("O") && table[1][2].equals("O") && table[2][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[0][0].equals("O") && table[1][1].equals("O") && table[2][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[0][0].equals("O") && table[0][1].equals("O") && table[0][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
        if (table[2][0].equals("O") && table[1][1].equals("O") && table[0][2].equals("O")) {
            labelWinner.setText("Winner is O");
            disableAll();
            addPointPlayer2();
        }
    }

    public void disableAll() {
        field00.setDisable(true);
        field01.setDisable(true);
        field02.setDisable(true);
        field10.setDisable(true);
        field11.setDisable(true);
        field12.setDisable(true);
        field20.setDisable(true);
        field21.setDisable(true);
        field22.setDisable(true);

    }

    public void addPointPlayer1() {
        pl1++;
        p1 = String.valueOf(pl1);
        player1Score.setText(p1);

    }

    public void addPointPlayer2() {
        pl2++;
        p2 = String.valueOf(pl2);
        player2Score.setText(p2);
    }


}
