public class Tvaryna {
    private String imya;
    public Tvaryna(String i){
        this.imya=i;
    }
    public String SkazatyPryvit()
    {
        return  String.format("Тварина %s каже привіт ", this.imya);
    }
    public String getImya(){
        return  this.imya;
    }

}
