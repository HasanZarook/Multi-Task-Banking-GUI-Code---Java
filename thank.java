import javax.swing.*;

public class thank extends JDialog {
    private JPanel panel1;
    public thank(){
        setContentPane(panel1);
        setModal(true);
    }
    public static void main(String[] args) {
        thank dialog = new thank();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
