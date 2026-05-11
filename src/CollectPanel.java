
import javax.swing.*;

public class CollectPanel extends JPanel {

    JButton nextButton;

    public CollectPanel() {

        setLayout(null);

        JLabel title = new JLabel("Step 4 - Collect Data");
        title.setBounds(350, 20, 250, 30);
        add(title);

        String[] columns = {
                "Metric",
                "Value",
                "Score"
        };

        String[][] data = {
                {"SUS Score", "89", "5"},
                {"Onboarding Time", "5", "5"},
                {"Video Start Time", "3", "4.5"},
                {"WCAG Compliance", "95", "5"}
        };

        JTable table = new JTable(data, columns);

        JScrollPane scrollPane =
                new JScrollPane(table);

        scrollPane.setBounds(50, 80, 800, 300);

        add(scrollPane);

        nextButton = new JButton("NEXT");
        nextButton.setBounds(380, 450, 120, 40);

        add(nextButton);
    }
}