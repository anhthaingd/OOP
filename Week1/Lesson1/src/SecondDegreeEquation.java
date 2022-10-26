public class SecondDegreeEquation {
    public static void main(String args[]) {
        System.out.println("Giai phuong trinh bac 2: ");
        solve(1,2,1);
    }

    public static void solve(double a, double b, double c) {
        double d = b * b - 4.0 * a * c;
        double x;
        if (d > 0.0) {
            x = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("x1 = " + x + "\tx2 = " + x2);
        } else if (d == 0.0) {
            x = -b / (2.0 *a);
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("No solution");
        }

    }
}
