import javax.swing.JFrame;
import javax.swing.JLabel;
import  java.awt.FlowLayout;


public class Vikno extends JFrame{

    JLabel lbl1;
    JLabel lbl2;

        public Vikno(){
            super("Моє перше вікно JFrame");
            setLayout( new FlowLayout());


            lbl1= new JLabel("Привіт, це перший JLabel");
            add(lbl1);
            lbl2= new JLabel("2й  JLabel");
            add(lbl2);

        }

}
