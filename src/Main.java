import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main extends JFrame implements ActionListener {

    private final JButton[][] buttons = new JButton[4][4];
    private boolean isXTurn = true;

    public Main() {
        setTitle("Tic-Tac-Toe");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setResizable(false);

        setLookAndFeel();
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(3, 3));

        for (var row = 0; row < 3; row++) {
            for (var col = 0; col < 3; col++) {
                var button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 60));
                button.addActionListener(this);
                buttons[row][col] = button;
                add(button);
            }
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var button = (JButton) e.getSource();

        if (!button.getText().isEmpty()) return;

        button.setText(isXTurn ? "X" : "O");
        button.setEnabled(false);

        if (checkForWin()) {
            showMessage((isXTurn ? "X" : "O") + " wins!");
            resetBoard();
        } else if (isBoardFull()) {
            showMessage("It's a draw!");
            resetBoard();
        } else {
            isXTurn = !isXTurn;
        }
    }

    private boolean isBoardFull() {
        for (var row : buttons) {
            for (var button : row) {
                if (button.getText().isEmpty()) return false;
            }
        }
        return true;
    }

    private boolean checkForWin() {
        var symbol = isXTurn ? "X" : "O";

        // Rows and columns
        for (var i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(symbol) &&
                    buttons[i][1].getText().equals(symbol) &&
                    buttons[i][2].getText().equals(symbol)) return true;

            if (buttons[0][i].getText().equals(symbol) &&
                    buttons[1][i].getText().equals(symbol) &&
                    buttons[2][i].getText().equals(symbol)) return true;
        }

        // Diagonals
        return (buttons[0][0].getText().equals(symbol) &&
                buttons[1][1].getText().equals(symbol) &&
                buttons[2][2].getText().equals(symbol)) ||
                (buttons[0][2].getText().equals(symbol) &&
                        buttons[1][1].getText().equals(symbol) &&
                        buttons[2][0].getText().equals(symbol));
    }

    private void resetBoard() {
        for (var row : buttons) {
            for (var button : row) {
                button.setText("");
                button.setEnabled(true);
            }
        }
        isXTurn = true;
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
