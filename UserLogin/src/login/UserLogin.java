package login;

import javax.swing.*;
import java.awt.event.*;

public class UserLogin extends JFrame implements ActionListener {
    JLabel userLabel, passwordLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton;

    UserLogin() {
        setTitle("User Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 20, 80, 30);
        add(userLabel);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 60, 80, 30);
        add(passwordLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 20, 200, 30);
        add(userTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 60, 200, 30);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 100, 80, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());

        // Check username and password
        if (username.equals("exampleUser") && password.equals("examplePassword")) {
            JOptionPane.showMessageDialog(this, "Login Successful");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }

    public static void main(String[] args) {
        new UserLogin();
    }
}
