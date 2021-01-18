import javax.swing.*;

public class TetrisGUI extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JPanel TetrisPanel;

    public TetrisGUI(String title){
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(TetrisPanel);
        this.pack();
    }

    public static void main(String [] args){
        JFrame test = new TetrisGUI("Tetris");
        test.setVisible(true);
    }
}
