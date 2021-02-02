public class Kit extends  Tvaryna {

    public Kit(String i ) {
        super(i);
    }
    @Override
    public String SkazatyPryvit()
    {
//        return  String.format("Тварина %s каже привіт,мяу ", super.getImya());

        return super.SkazatyPryvit()+", мяу";
    }
}
