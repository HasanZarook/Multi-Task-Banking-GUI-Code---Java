import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageAccount extends JDialog{
    private JTextField textField1;
    private JTextField textField2;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton accountInfoButton;
    private JPanel contentPane;
    private JButton cancelButton;

    public ManageAccount(){
        setContentPane(contentPane);
        setModal(true);
        accountInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accinfo();
            }
        });

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dep();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                with();
            }
        });

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
    public void accinfo(){
        AccountInfo dialog = new AccountInfo();
        dialog.pack();
        this.setContentPane(dialog.getContentPane());
    }
    public void dep(){
        Deposit dialog = new Deposit();
        dialog.pack();
        this.setContentPane(dialog.getContentPane());
    }

    public void with(){
        Withdraw dialog = new Withdraw();
        dialog.pack();
        this.setContentPane(dialog.getContentPane());
    }
    public static void main(String[] args) {
        ManageAccount dialog = new ManageAccount();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
