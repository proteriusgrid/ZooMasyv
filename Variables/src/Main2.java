/**
 * Created by GRID on 09.04.2017.
 */
public class Main2 {

    static Integer in =2;
    static Float fl= 2.6f;
    static Short s = 3;
    static Double f= 7.8;
    static String st= "27";

    public static void main(String[] args) {
        Number n = fl;

        Number n1 = new Double(2.6);

        Integer rl = n.intValue();
        Integer r2 = n1.intValue();

        Number n3 = f ;
        int ns = n3.intValue();

        System.out.println(rl);
    }
}
