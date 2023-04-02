package GameDev2D;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class LogInWithLoop implements ActionListener {

  private static JFrame frame;
  private static JLabel userLabel, PasswordLabel;
  private static JTextField userText;
  private static JPasswordField passwordtext;
  private static JButton button;
  private static JPanel panel;
  private static JCheckBox checkbox;
  private static ActionListener java;
  private static char YN; // this is for Conditional statement for While
  private static String Y;

  public static void main(String Args[]) {
    // instation for Things:
    frame = new JFrame();
    userLabel = new JLabel("User:");
    PasswordLabel = new JLabel("Password:");
    userText = new JTextField(20); // JtextField to get The Line input
    passwordtext = new JPasswordField(20);
    button = new JButton("submit");
    panel = new JPanel();
    checkbox = new JCheckBox("Remember Password?"); // Remember password

    do {

      String answer = JOptionPane.showInputDialog(null, "You Want to Proceed?");

      if (answer.equalsIgnoreCase("Yes")) {

        //settings
        // frame
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // panel
        panel.setLayout(null);
        panel.setBackground(Color.red);

        // Label of User and Password use setBounce to arrage line:
        // user
        userLabel.setBounds(10, 15, 85, 25);
        userLabel.setForeground(Color.DARK_GRAY);
        panel.add(userLabel);

        // password
        PasswordLabel.setBounds(10, 60, 85, 25);
        PasswordLabel.setForeground(Color.DARK_GRAY);
        panel.add(PasswordLabel);

        userText.setBounds(75, 15, 200, 25);
        userText.setBackground(Color.LIGHT_GRAY);
        panel.add(userText);
        passwordtext.setBounds(75, 60, 200, 25);
        passwordtext.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(new LogInWithLoop());
        panel.add(passwordtext);

        button.setBounds(200, 90, 100, 25);
        button.setBackground(Color.yellow);
        panel.add(button);

        checkbox.setBounds(1, 90, 200, 25);
        checkbox.setBackground(Color.lightGray);
        panel.add(checkbox);

        frame.setVisible(true);
      } // end of if: 
      else {
        String YN = JOptionPane.showInputDialog(null, "You want again? Type Y for Yes Type N for No");

      } // end of else  
    } while (YN == 'N' || YN == 'n');
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    String user = userText.getText();
    String pass = passwordtext.getText();
    String again = Y;

    do {
      if (user.equals("rai") && pass.equals("rairai")) {
        JOptionPane.showMessageDialog(null, "You are Logged", "Warning", JOptionPane.PLAIN_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(null, "You Email or pass is inccorect", "Warning", JOptionPane.ERROR_MESSAGE);
        again = JOptionPane.showInputDialog("You want to Try again?");
      }
    } while (again.equals("no") && again.equals("No"));

    if (again.equalsIgnoreCase("no")) {
      JOptionPane.showMessageDialog(null, "The System is shutting Down", "Warning", JOptionPane.PLAIN_MESSAGE);
    }
  }
}
