public class Polymorphism {
    public static void main( String[] args ) {

        Tvaryna[] tm = new Tvaryna[3];
        tm[0] = new Tvaryna();
        tm[1] = new Kit();
        tm[2] = new Drakon();

        for (Tvaryna t: tm){
            t.SkazatyPryvit();
        }
//        Tvaryna t = new Tvaryna();
//        Tvaryna tk = new Kit();
//        Tvaryna td = new Drakon();
//
////        t.SkazatyPryvit();
////        k.SkazatyPryvit();
////        d.SkazatyPryvit();
//

    }
}
