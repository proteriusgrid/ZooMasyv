/**
 * Created by GRID on 10.04.2017.
 */
public class Main7 {
    public static void main(String[] args) {
        int val = calcSum(1, -1);
        System.out.println(val);

    }
    static  int  calcSum(int a, int b){
        int sum = a + b;

        if (sum == 0) {
            calcSum(1, 1);
        }
    return sum;
    }

}
