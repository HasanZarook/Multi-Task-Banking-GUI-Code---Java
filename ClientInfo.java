import javax.swing.*;

public class ClientInfo extends JDialog{
    private JTextField textField1;
    private JTextField textField2;
    private JTable table1;
    private JButton previousPageButton;
    private JButton cancelButton;
    private JPanel contentPane;

    public ClientInfo(){
        setContentPane(contentPane);
        setModal(true);
    }

    public static void main(String[] args) {
        ClientInfo dialog = new ClientInfo();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
