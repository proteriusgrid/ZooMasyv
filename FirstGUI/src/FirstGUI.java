import  javax.swing.JOptionPane;

public class FirstGUI {
    public static void main( String[] args ) {

        String imya = JOptionPane.showInputDialog("Введіть своє ім'я");
        String prizv = JOptionPane.showInputDialog("Введіть своє прізвище");

        String vitannya = String.format("Вітаємо у нашій першій віконній програмі, %s %s ", imya, prizv);

        JOptionPane.showMessageDialog(null, vitannya, "Вітання", JOptionPane.INFORMATION_MESSAGE);

    }
}

