public class Client {

    private String imya;
    public Client(String i){
        this.imya = i;
    }
    public void Jisty(Strava s){
        System.out.println("Клієнт "+ imya +" з'їв страву ("+s.getClass().getName()+")");
    }

}
