import java.time.LocalDateTime;

public class Enum1 {
    public static void main( String[] args )
    {

        switch (getPoraRoku())
        {
            case  ZYMA:
                System.out.println("Вдягайтесь дуже тепло.");
                break;
            case  VESNA:
                System.out.println("Вдягайтесь  по-весняному.");
                break;
            case  LITO:
                System.out.println("Вдягайтесь  легко.");
                break;
            case  OSIN:
                System.out.println("Вдягайтесь  по-осінньму.");
                break;
            default:
                System.out.println("Вдягайтесь як хочете, я не знаю яка зараз пора рокую");
                break;
        }

    }

    public  static PoryRoku getPoraRoku()
    {
        LocalDateTime now = LocalDateTime.now();
        int m = now.getMonthValue();
        switch (m){
            case 1:
            case 2:
            case 12:
                return PoryRoku.ZYMA;
            case 3:
            case 4:
            case 5:
                return PoryRoku.VESNA;
            case 6:
            case 7:
            case 8:
                return PoryRoku.LITO;
            case 9:
            case 10:
            case 11:
                return PoryRoku.OSIN;
            default:
                return PoryRoku.NEVIDOMA;

        }
    }
}
