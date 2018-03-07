import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CounterPanel extends JPanel {

    private JLabel countLabel;
    private int count;

    public CounterPanel() {
        //Initialize count at beginning value
        count=0;
        setLayout(new BorderLayout());

        //Create Components
        JPanel mainPanel = new JPanel();
        countLabel = new JLabel("Count: " + count);
        JButton countButton = new JButton("Increase Count");

        //Set background color of Components
        Color columbiaBlue = new Color(196, 216, 226);
        mainPanel.setBackground(columbiaBlue);

        //Set sizing and positioning of Components
        int mainPanelWidth = 200;
        int countLabelWidth = 80;
        int countButtonWidth = 150;
        int countLabelMargin = (mainPanelWidth - countLabelWidth)/2;
        int countButtonMargin = (mainPanelWidth - countButtonWidth)/2;
        mainPanel.setPreferredSize(new Dimension (mainPanelWidth, 80));
        countLabel.setBounds(countLabelMargin, 20, countLabelWidth, 50);
        countButton.setBounds(countButtonMargin, 70, countButtonWidth, 50);

        //Add ActionListeners to Buttons
        countButton.addActionListener(new CountListener());

        //mainPanel component add
        mainPanel.add(countLabel);
        mainPanel.add(countButton);

        //CounterPanel Component add
        add(mainPanel, BorderLayout.CENTER);
        add(new JLabel("DPR 104: JAVA COUNTER EXAMPLE"), BorderLayout.PAGE_START);

    }

    private class CountListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            //increment the count and update countLabel
            count += 1;
            countLabel.setText("Count: " + count);
        }
    }
}
