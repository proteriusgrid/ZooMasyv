public class Client {


    private  String imya;
    private Data dataNarodzhennya;
    private  Data dataReyestratsiyi;

//    private int denNar;
//    private int misyatsNar;
//    private int rikNar;


    public  Client (String i, Data dn)
    {
        this.imya = i;
        this.dataNarodzhennya = dn;
//        this.denNar = d;
//        this.misyatsNar = m;
//        this.rikNar = r;

    }
    public  String toString(){
        return String.format("Ім'я: %s%nДата народження:%s", imya, dataNarodzhennya );
    }
}
