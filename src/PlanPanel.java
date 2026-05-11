
import javax.swing.*;
import java.awt.*;

public class PlanPanel extends JPanel {

    JButton nextButton;

    public PlanPanel() {

        setLayout(null);

        JLabel title = new JLabel("Step 3 - Plan Measurement");
        title.setBounds(350, 20, 250, 30);
        add(title);

        String[] columns = {
                "Metric",
                "Coefficient",
                "Direction",
                "Range",
                "Unit"
        };

        String[][] data = {
                {"SUS Score", "50", "Higher", "0-100", "points"},
                {"Onboarding Time", "50", "Lower", "0-60", "min"},
                {"Video Start Time", "50", "Lower", "0-15", "sec"},
                {"WCAG Compliance", "50", "Higher", "0-100", "%"}
        };

        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);

        scrollPane.setBounds(50, 80, 800, 300);

        add(scrollPane);

        nextButton = new JButton("NEXT");
        nextButton.setBounds(380, 450, 120, 40);

        add(nextButton);
    }
}
