import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class SignIN extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel tryagain;
    private JLabel success;

    public SignIN() {
        setContentPane(contentPane);
        setModal(true);
        tryagain.setVisible(false);
        success.setVisible(false);

        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    onOK();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() throws FileNotFoundException {
        // add your code here
        char[] in = passwordField1.getPassword();
        String passwordchar= "";
        for(char c : in){
            passwordchar = passwordchar+c;
        }
        File passuserfile = new File("src/passwordFile.txt");
        Scanner input = new Scanner(passuserfile);
        while (input.hasNext()){
            String[] str =input.nextLine().split(",",0);
            String username =str[0];
            String password =str[1];
            if(username.compareTo(textField1.getText())==0 && password.compareTo(passwordchar)==0){
                tryagain.setVisible(true);
                success.setVisible(false);
            }
            else{
                tryagain.setVisible(false);
                success.setVisible(true);
            }

        }
    }

    private void onCancel()  {
        // add your code here if necessary
       dispose();

    }


    public static void main(String[] args) {
        SignIN dialog = new SignIN();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
