public class Zoopark2 {

    public static void main( String[] args ) {
        Tvaryna t = new Tvaryna();
        Tvaryna k =new Kit();
        Tvaryna m =new Myshka();


        PokazatyTvarynu(t);
        PokazatyTvarynu(k);
        PokazatyTvarynu(m);
    }

    public static void   PokazatyTvarynu(Tvaryna t){
        System.out.println("Показуємо тварину:");
        t.Pryvitatysya();
    }
}
