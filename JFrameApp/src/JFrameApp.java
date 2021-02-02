import javax.swing.*;

public class JFrameApp {
    public static void main( String[] args ) {
        Vikno v= new Vikno();
        v.setSize(400,200);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
