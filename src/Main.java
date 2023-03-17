import java.util.Calendar;
import java.util.Scanner;

public class JAVA04 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        int year = 2020;
        int month = Calendar.FEBRUARY;
        int date = 1;


        cal.set(year, month, date);

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(cal.get(Cal));
//		int b = cal.get(Calendar.YEAR);
//		int c = b+1;
//		System.out.println(c);
//
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();


    }

}
