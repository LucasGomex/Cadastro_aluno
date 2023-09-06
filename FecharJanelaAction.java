/**
 * @author Rodrigo Braga e  Lucas Gomes
 */

import java.awt.event.*;

public class FecharJanelaAction
    extends WindowAdapter
    implements ActionListener
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
