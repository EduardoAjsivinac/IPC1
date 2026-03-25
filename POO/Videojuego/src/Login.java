import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel mainPanel;
    private JTextField txtUser;
    private JTextField txtPassword;
    private JButton ingresarButton;
    public boolean loginCorrecto;

    public Login() {

        // Lea el archivo de usuarios


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanel(){
        return mainPanel;
    }
}
