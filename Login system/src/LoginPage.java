import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID");
    JLabel userPasswordLabel = new JLabel("password");
    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String, String> loginInfoOriginal){

        logininfo = loginInfoOriginal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
