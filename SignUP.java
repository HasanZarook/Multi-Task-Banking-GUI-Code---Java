import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SignUP extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JTextField textField2;
    private JLabel success;

    public SignUP() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        success.setVisible(false);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
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

   /* private void onOK() {
        // add your code here
        dispose();
        success.setVisible(true);
    }*/

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void onOK() {
        try{
            BufferedWriter addtext1 = new BufferedWriter(new FileWriter("src/detailFile.txt"));
            BufferedWriter pass = new BufferedWriter(new FileWriter("src/passwordFile.txt"));


            pass.write(textField1.getText() +",");
            addtext1.write(textField2.getText() +",");
            addtext1.write(textField3.getText() +"\n");

            pass.write(passwordField1.getPassword()+"\n");
            addtext1.close();
            pass.close();
            if(textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty() || passwordField1.getPassword().length==0 ){
            success.setVisible(false);}
            else {
                success.setVisible(true);
            }




        }
        catch(IOException err){
            System.err.println("File not Found.");
        }
    }
    public static void main(String[] args) {
        SignUP dialog = new SignUP();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
