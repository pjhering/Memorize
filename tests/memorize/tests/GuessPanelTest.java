package memorize.tests;

import javax.swing.JFrame;
import memorize.viewer.GuessPanel;

public class GuessPanelTest
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame ("GuessPanelTest");
        GuessPanel panel = new GuessPanel ();
        panel.termLabel.setText ("GuessPanelTest");
        panel.answer1Button.setText ("answer1Button");
        panel.answer2Button.setText ("answer2Button");
        panel.answer3Button.setText ("answer3Button");
        panel.answer4Button.setText ("answer4Button");
        frame.setContentPane (panel);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack ();
        frame.setVisible (true);
    }
}
