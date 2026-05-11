
import javax.swing.*;
import java.awt.*;

public class DefinePanel extends JPanel {

    JButton nextButton;

    public DefinePanel() {

        setLayout(null);

        JLabel title = new JLabel("Step 2 - Define");
        title.setBounds(380, 30, 200, 30);
        add(title);

        JLabel qualityLabel = new JLabel("Select Quality Type:");
        qualityLabel.setBounds(100, 100, 200, 30);
        add(qualityLabel);

        JRadioButton productButton =
                new JRadioButton("Product Quality");

        productButton.setBounds(100, 150, 200, 30);
        add(productButton);

        JRadioButton processButton =
                new JRadioButton("Process Quality");

        processButton.setBounds(100, 190, 200, 30);
        add(processButton);

        ButtonGroup qualityGroup = new ButtonGroup();
        qualityGroup.add(productButton);
        qualityGroup.add(processButton);

        JLabel modeLabel = new JLabel("Select Mode:");
        modeLabel.setBounds(100, 280, 200, 30);
        add(modeLabel);

        JRadioButton educationButton =
                new JRadioButton("Education");

        educationButton.setBounds(100, 330, 200, 30);
        add(educationButton);

        JRadioButton healthButton =
                new JRadioButton("Health");

        healthButton.setBounds(100, 370, 200, 30);
        add(healthButton);

        ButtonGroup modeGroup = new ButtonGroup();
        modeGroup.add(educationButton);
        modeGroup.add(healthButton);

        JLabel scenarioLabel = new JLabel("Scenario:");
        scenarioLabel.setBounds(500, 100, 200, 30);
        add(scenarioLabel);

        String[] scenarios = {
                "Scenario A - Team Alpha",
                "Scenario B - Team Beta"
        };

        JComboBox<String> scenarioBox =
                new JComboBox<>(scenarios);

        scenarioBox.setBounds(500, 150, 250, 30);
        add(scenarioBox);

        nextButton = new JButton("NEXT");
        nextButton.setBounds(380, 500, 120, 40);
        add(nextButton);
    }
}