import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TetrisGUI extends JFrame {
    private JPanel TetrisPanel;
    private JTable table1;


    public TetrisGUI(String title){
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(TetrisPanel);
        this.table1.setModel(new DefaultTableModel(
                null,
                new String[]{"test1","test2"}
        ));
        this.pack();
    }

    public static void main(String [] args){
        JFrame test = new TetrisGUI("Tetris");
        test.setVisible(true);
    }
}
