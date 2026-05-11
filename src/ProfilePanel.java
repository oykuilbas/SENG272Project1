
import javax.swing.*;
import java.awt.*;

public class ProfilePanel extends JPanel {

    JTextField userField;
    JTextField schoolField;
    JTextField sessionField;
    JButton nextButton;

    public ProfilePanel() {
        setLayout(null);

        JLabel title = new JLabel("Step 1 - Profile");
        title.setBounds(380, 30, 200, 30);
        add(title);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(250, 120, 120, 30);
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(380, 120, 220, 30);
        add(userField);

        JLabel schoolLabel = new JLabel("School:");
        schoolLabel.setBounds(250, 180, 120, 30);
        add(schoolLabel);

        schoolField = new JTextField();
        schoolField.setBounds(380, 180, 220, 30);
        add(schoolField);

        JLabel sessionLabel = new JLabel("Session Name:");
        sessionLabel.setBounds(250, 240, 120, 30);
        add(sessionLabel);

        sessionField = new JTextField();
        sessionField.setBounds(380, 240, 220, 30);
        add(sessionField);

        nextButton = new JButton("NEXT");
        nextButton.setBounds(400, 330, 120, 40);
        add(nextButton);
    }
}
