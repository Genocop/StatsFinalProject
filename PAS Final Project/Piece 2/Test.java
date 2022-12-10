import javax.swing.SwingUtilities;

public class Test {

    public static void main(String[] args)
    {
        //Run the program
        SwingUtilities.invokeLater(() -> new Plot(150).setVisible(true));
    }

}
