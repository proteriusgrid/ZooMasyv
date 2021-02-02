public class Drakon extends Tvaryna{
    public Drakon( String i) {
        super(i);
    }
    @Override
    public String SkazatyPryvit()
    {
        return  String.format("Дракон %s з вогнем кричить Пшшивіт ", super.getImya());
    }
}
