import java.io.PrintStream;
import java.util.Scanner;
public class Main2 {



    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        if (ts.length == 0) {
            return 0;
        }
        int minorTemp = ts[0];
        for (int i = 1; i < ts.length; i++) {
            minorTemp = checkTemp(ts[i], minorTemp);
        }

        return minorTemp;
    }

    private static int checkTemp(int temp, int minorTemp) {
        if (getCalc(temp) < getCalc(minorTemp)) {
            return temp;
        } else if (getCalc(temp) == getCalc(minorTemp)) {
            return getCalc(temp);
        }
        return minorTemp;
    }

    private static int getCalc(int minorTemp) {
        return Math.abs(Math.subtractExact(minorTemp, 0) * -1);
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }
    // #endregion
}
