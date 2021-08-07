package practice;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,80,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,80,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(100,120,100,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,150,300,25);
        panel.add(success);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("Aviv")&& password.equals("Ousul")){
            success.setText("Login Successfuly!");
        }
    }
}
