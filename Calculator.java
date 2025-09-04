import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JDialog {
    private JPanel contentPane;

    private JButton buttonCancel;
    private JTextField textField1;
    private JButton SIMPLIFY;
    private JButton DIVIDE;
    private JButton SUBSTRACT;
    private JButton Multiply;
    private JButton SUM;
    private JTextField textField2;
    private JTextField Res;

    public Calculator() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonCancel);



        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });
        SUM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sum();
            }
        });
        SUBSTRACT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sub();
            }
        });
        Multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Mul();
            }
        });
        DIVIDE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Div();
            }
        });
        SIMPLIFY.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sim();
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


    private void Sum()
    {
        float x= Float.parseFloat(textField1.getText());
        float y= Float.parseFloat(textField2.getText());
        float res=x+y;
        Res.setText(res+"");
    }
    private void Sim()
    {
        float x= Float.parseFloat(textField1.getText());
        float y= Float.parseFloat(textField2.getText());
        float x1=x;
        float y2=y;
        while(x1 !=y2)
        {if (x1>y2){x1=x1-y2;}
        else{y2=y2-x1;}}
        float res1=x/x1;
        float res2=y/x1;
        Res.setText(res1+"/"+res2);
    }
    private void Sub()
    {
        float x= Float.parseFloat(textField1.getText());
        float y= Float.parseFloat(textField2.getText());
        float res=x-y;
        Res.setText(res+"");
    }
    private void Mul()
    {
        float x= Float.parseFloat(textField1.getText());
        float y= Float.parseFloat(textField2.getText());
        float res=x*y;
        Res.setText(res+"");
    }

    private void Div()
    {
        float x= Float.parseFloat(textField1.getText());
        float y= Float.parseFloat(textField2.getText());
        float res=x/y;
        Res.setText(res+"");
    }



    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Calculator dialog = new Calculator();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
