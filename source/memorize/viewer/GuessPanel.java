package memorize.viewer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuessPanel extends JPanel
{
    public final JTextArea termLabel;
    public final JButton answer1Button;
    public final JButton answer2Button;
    public final JButton answer3Button;
    public final JButton answer4Button;
    public final JProgressBar progressbar;

    public GuessPanel ()
    {
        termLabel = new JTextArea (5, 50);
        answer1Button = new JButton ();
        answer2Button = new JButton ();
        answer3Button = new JButton ();
        answer4Button = new JButton ();
        progressbar = new JProgressBar ();
        initialize ();
    }

    private void initialize ()
    {
        setBorder (BorderFactory.createEmptyBorder (10, 10, 10, 10));
        setLayout (new BorderLayout (10, 10));

        termLabel.setEditable (false);
        add (new JScrollPane (termLabel), BorderLayout.CENTER);

        JPanel buttons = new JPanel (new GridLayout (4, 1, 10, 10));
        buttons.add (answer1Button);
        buttons.add (answer2Button);
        buttons.add (answer3Button);
        buttons.add (answer4Button);

        JPanel south = new JPanel (new BorderLayout (10, 10));
        south.add (buttons, BorderLayout.CENTER);
        south.add (progressbar, BorderLayout.SOUTH);
        add (south, BorderLayout.SOUTH);
    }
}
