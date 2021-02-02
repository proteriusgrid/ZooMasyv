public class MethodOverriding {

    public static void main( String[] args ) {
        Tvaryna t = new Tvaryna("Марина");
        Kit k = new Kit("Мурзік");
        Drakon d = new Drakon("Вогнемет");

        System.out.println(t.SkazatyPryvit());
        System.out.println(k.SkazatyPryvit());
        System.out.println(d.SkazatyPryvit());

    }
}
