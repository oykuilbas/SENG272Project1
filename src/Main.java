
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame =
                new JFrame("ISO 15939 Simulator");

        frame.setSize(1000, 700);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        CardLayout cardLayout =
                new CardLayout();

        JPanel mainPanel =
                new JPanel(cardLayout);

        ProfilePanel profilePanel =
                new ProfilePanel();

        DefinePanel definePanel =
                new DefinePanel();

        PlanPanel planPanel =
                new PlanPanel();

        CollectPanel collectPanel =
                new CollectPanel();

        AnalysePanel analysePanel =
                new AnalysePanel();

        mainPanel.add(profilePanel, "profile");
        mainPanel.add(definePanel, "define");
        mainPanel.add(planPanel, "plan");
        mainPanel.add(collectPanel, "collect");
        mainPanel.add(analysePanel, "analyse");

        // STEP 1 -> STEP 2
        profilePanel.nextButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(profilePanel.userField.getText().isEmpty()
                        || profilePanel.schoolField.getText().isEmpty()
                        || profilePanel.sessionField.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(frame,
                            "Please fill all fields.");

                }

                else {

                    cardLayout.show(mainPanel, "define");

                }
            }
        });

        // STEP 2 -> STEP 3
        definePanel.nextButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                cardLayout.show(mainPanel, "plan");

            }
        });

        // STEP 3 -> STEP 4
        planPanel.nextButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                cardLayout.show(mainPanel, "collect");

            }
        });

        // STEP 4 -> STEP 5
        collectPanel.nextButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                cardLayout.show(mainPanel, "analyse");

            }
        });

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}