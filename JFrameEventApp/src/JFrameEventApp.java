import javax.swing.JFrame;

public class JFrameEventApp {

    public static void main( String[] args ) {

        Vikno v = new Vikno();
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setTitle("Вікно з обробками подій");
        v.setSize(400, 150);
        v.setVisible(true);

    }
}

