import javax.sound.midi.SysexMessage;
import java.math.BigDecimal;

public class Main {
    // 100 files
    // variables and data types
    public static void main(String[] args) {
        // top to bottom
        // if else if ladder
        // paths, branches
//        int agg = 70;
//        if (agg >= 70) {
//            System.out.println("Distinction");
//        } else if (agg >= 60) {
//            System.out.println("I Class");
//        } else if (agg >= 50) {
//            System.out.println("II Class");
//        } else if (agg >= 40) {
//            System.out.println("III Class");
//        } else {
//            System.out.println("Failed");
//        }

        int agg = 80;
        switch (agg) {
            case 80:
            case 70:
                System.out.println("Distinction");
                break;
            case 60:
                System.out.println("I Class");
                break;
            case 50:
                System.out.println("II Class");
                break;
            case 40:
                System.out.println("III Class");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
