import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdraw extends JDialog {
    private JTextField textField1;
    private JButton withdrawButton;
    private JButton cancelButton;
    private JPanel contentPane;

    public Withdraw(){
        setContentPane(contentPane);
        setModal(true);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thnx();
            }
        });
    }
    public void thnx(){
        thank dialog = new thank();
        dialog.pack();
        this.setContentPane(dialog.getContentPane());
    }
    public static void main(String[] args) {
        Withdraw dialog = new Withdraw();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
