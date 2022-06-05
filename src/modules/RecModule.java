package modules;

public class RecModule {

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fac(n - 1);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return pow(x * x, n / 2);
        }
        return x * pow(x * x, n / 2);

    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

}