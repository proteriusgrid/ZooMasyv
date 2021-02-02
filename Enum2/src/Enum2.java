public class Enum2 {
    public static void main( String[] args ) {

//        Kolir k = Kolir.RED;
//        if (k ==Kolir.RED){
//            System.out.println("Колір - червоний");
//        }else {
//            System.out.println("Колір не червоний");
//        }
//

        for (Kolir k: Kolir.values()){
            System.out.printf("%s %s%n", k, k.getRGB());
        }

    }
}
