
import javax.swing.*;

public class AnalysePanel extends JPanel {

    public AnalysePanel() {

        setLayout(null);

        JLabel title =
                new JLabel("Step 5 - Analyse");

        title.setBounds(350, 30, 250, 30);

        add(title);

        JLabel usability =
                new JLabel("Usability Score: 5.0");

        usability.setBounds(100, 120, 250, 30);

        add(usability);

        JProgressBar usabilityBar =
                new JProgressBar(0, 5);

        usabilityBar.setValue(5);

        usabilityBar.setStringPainted(true);

        usabilityBar.setBounds(350, 120, 300, 30);

        add(usabilityBar);

        JLabel performance =
                new JLabel("Performance Score: 4.5");

        performance.setBounds(100, 200, 250, 30);

        add(performance);

        JProgressBar performanceBar =
                new JProgressBar(0, 5);

        performanceBar.setValue(4);

        performanceBar.setStringPainted(true);

        performanceBar.setBounds(350, 200, 300, 30);

        add(performanceBar);

        JLabel gap =
                new JLabel("Lowest Dimension: Performance");

        gap.setBounds(100, 320, 400, 30);

        add(gap);
    }
}