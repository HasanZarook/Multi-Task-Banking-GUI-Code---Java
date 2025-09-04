import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AutoFill extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton saveButton;
    private JButton swapButton;
    private JButton autofillButton;


    public AutoFill() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filehandling();
            }
        });

        autofillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AutoFill();
            }
        });

        swapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Swap();
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

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void AutoFill(){
        textField2.setText(textField1.getText());
    }

    private void Swap(){
        String str1 = textField1.getText();
        String str2 = textField2.getText();
        textField1.setText(str2);
        textField2.setText(str1);
    }

    public void filehandling() {
        try{
            BufferedWriter addtext1 = new BufferedWriter(new FileWriter("src/file.txt"));
            BufferedWriter addtext2 = new BufferedWriter(new FileWriter("src/file2.txt"));

                addtext1.write(textField1.getText() +",");
                addtext1.close();
                addtext2.write(textField2.getText() +",");
                addtext2.close();

        }
        catch(IOException err){
            System.err.println("File not Found.");
        }
    }

    public static void main(String[] args) {
        AutoFill dialog = new AutoFill();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
