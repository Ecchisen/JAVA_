// This program demonstrates the use of JPanel in Java Swing.
import javax.swing.*;

public class jpanel_demo extends JFrame{
    public jpanel_demo() {
        super("JPanel Demo");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setLayout(null);//necessary for absolute positioning of frame components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel namelabel = new JLabel("Name: ");
        namelabel.setBounds(50, 50, 100, 30);
        JTextField namefield = new JTextField();
        namefield.setBounds(150, 50, 200, 30);
        JLabel passwordlabel = new JLabel("Password: ");
        passwordlabel.setBounds(50, 100, 100, 30);
        JPasswordField passwordfield = new JPasswordField();
        passwordfield.setBounds(150, 100, 200, 30);
        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(50, 150, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 150, 200, 30);
        JLabel phoneLabel = new JLabel("Phone: ");
        phoneLabel.setBounds(50, 200, 100, 30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 200, 200, 30);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 50, 300, 300);
        panel.add(namelabel);
        panel.add(namefield);
        panel.add(passwordlabel);
        panel.add(passwordfield);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);

        JLabel countryLabel = new JLabel("Country: ");
        countryLabel.setBounds(50, 250, 100, 30);
        String[] countries = {"USA", "Nepal", "Canada", "UK", "Australia", "India"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(150, 250, 200, 30);
        countryComboBox.setSelectedIndex(1);
        panel.add(countryLabel);
        panel.add(countryComboBox);
        
        add(panel);
    }
    public static void main(String[] args) {
        jpanel_demo frame = new jpanel_demo();
        
        frame.setVisible(true);
    }
}