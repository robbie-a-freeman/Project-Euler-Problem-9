public class Main {

    public static void main(String[] args) {

        int a, b, c;
        double cDec;
        int total = 1000;
        for (a = 1; a < total / 3 + 1; a++) {
            b = total - a;
            for (; b > a; b--) {
                cDec = Math.sqrt(a * a + b * b);
                c = (int) cDec;
                if (c < total / 3 || c == b || cDec > c + 0.001 || cDec < c - 0.001)
                    continue;
                if (a + b + c == total) {
                    System.out.println(a*b*c);
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
}
