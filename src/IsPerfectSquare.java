public class IsPerfectSquare {
    static boolean IsPerfectSquare(int x)
    {
        if (x >= 2) {

            // Find floating point value of
            // square root of x.
            int sr = (int)Math.sqrt(x);

            // if product of square root
            // is equal, then
            // return T/F

            return ((sr * sr) == x);
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x = 4;

        if (IsPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}
