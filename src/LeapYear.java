public class LeapYear {

    public static void main (String args[]) {
        int year = 2025;

        for (int i = 2000; i < year ; i++) {

            if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))) {
                System.out.println(i + " leap year");
            } else {
                continue;
            }
        }}}
