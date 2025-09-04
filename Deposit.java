import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JDialog{
    private JTextField textField1;
    private JButton depositButton;
    private JPanel contentPane;
    private JButton cancelButton;

    public Deposit(){
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
        Deposit dialog = new Deposit();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
