import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Vikno extends JFrame {
    private JLabel lbl1;
    private JButton btnVstanovyty, btnVyterty;
    public  Vikno(){
        setLayout(new FlowLayout());
        lbl1 = new JLabel(" ");
        add(lbl1);
        obrobnykPodij op = new obrobnykPodij();

        btnVstanovyty = new JButton("Встановити");
        add(btnVstanovyty);
        btnVstanovyty.addActionListener(op);

        btnVyterty = new JButton("Витерти");
        add(btnVyterty);
        btnVyterty.addActionListener(op);


    }

    public  class  obrobnykPodij implements ActionListener {
        public  void actionPerformed ( ActionEvent p ) {
         if (p.getSource()==btnVstanovyty){
             Calendar c = Calendar.getInstance();
             lbl1.setText("Кнопку натиснули в: "+ c.getTime());
         }

         else if (p.getSource()== btnVyterty){
             lbl1.setText("");

         }
        }
    }
}
