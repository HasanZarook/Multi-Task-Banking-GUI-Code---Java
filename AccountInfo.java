import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AccountInfo extends JDialog{
    private JButton cancelButton;
    private JPanel contentPane;

    public AccountInfo(){
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
        AccountInfo dialog = new AccountInfo();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
