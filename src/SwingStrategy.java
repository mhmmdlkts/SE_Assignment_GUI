import javax.swing.*;
import java.awt.*;

public class SwingStrategy extends JFrame implements UIPlatforms {
    public SwingStrategy() {
        setPreferredSize(new Dimension(450, 650));
        setEnabled(false);
        setLayout(new GridLayout(5,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Muhammed Ali Aktas");
        pack();
    }

    @Override
    public void addInputField(String text) {
        add(new JLabel(text));
        add(new JTextField());
    }

    @Override
    public void addSurveyQuestion(String question, boolean isChecked) {
        JCheckBox checkBox = new JCheckBox();
        checkBox.setSelected(isChecked);
        add(new JLabel(question));
        add(checkBox);
    }

    @Override
    public void addProgressLabel(double value) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue((int)value);
        add(progressBar);
    }

    @Override
    public void drawUI() {
        setVisible(true);
        setEnabled(true);
        // This will only cause the task bar entry
        // for this frame to blink
        toFront();

        // This will bring the window to the front,
        // but not make it the "active" one
        setAlwaysOnTop(true);
        setAlwaysOnTop(false);

        if (!isActive()) {
            setState(JFrame.NORMAL);
        }
    }
}
