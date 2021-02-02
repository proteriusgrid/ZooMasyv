import javax.swing.*;

public class JFrameEvent2Knopky {
    public static void main( String[] args ) {
        Vikno v = new Vikno();

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setTitle("Дві кнопки");
        v.setSize(350, 150);
        v.setVisible(true);
    }

}
