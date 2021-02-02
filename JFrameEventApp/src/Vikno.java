import  javax.swing.JFrame;
import  java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import  javax.swing.JLabel;
import  javax.swing.JButton;

public class Vikno extends JFrame {

    private JLabel lbl1;
    private JButton btn1;
    public Vikno(){

        setLayout(new FlowLayout());
        lbl1 = new JLabel(" ");
        add(lbl1);
        btn1 = new JButton("Натисни мене");
        add(btn1);

        obrobnykPodij op =new obrobnykPodij();
        btn1.addActionListener(op);
    }
    public class  obrobnykPodij implements ActionListener{
        @Override
        public void actionPerformed( ActionEvent podiya ) {
               String txt= lbl1.getText();
               lbl1.setText(txt+txt.length());
        }
    }
}
