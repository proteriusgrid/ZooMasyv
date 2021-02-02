public class Podiya {
    private int den;
    private int misyats;
    private int rik;
    private String podiya;

    public  Podiya (int d, int m, int r, String p)
    {
        this.den = d;
        this.misyats = m;
        this.rik= r;
        this.podiya = p;
    }

    public String toString(){
        return String.format("%d/%d/%d - %s", den, misyats, rik, podiya);
    }

}
