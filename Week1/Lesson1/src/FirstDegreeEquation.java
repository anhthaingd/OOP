import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Phuong trinh bac nhat 1 an");
        String strNum1,strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Input first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Input second number ",JOptionPane.INFORMATION_MESSAGE);
        String showEquation1;
        showEquation1 = "Equotion 1: " + strNum1 + "x" + " + " + strNum2 + " = 0";
        JOptionPane.showMessageDialog(null,showEquation1,"Equotion",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        if (num1 == 0 && num2 == 0) {
            JOptionPane.showMessageDialog(null,"Phuong trinh vo so nghiem");
        } else if (num1 == 0 && num2 != 0) {
            JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem");
        } else {
            double x = -num2/num1;
            String strX = String.valueOf(x);
            JOptionPane.showMessageDialog(null,"Nghiem cua phuong trinh: " + strX);
        }
        System.out.println("Phuong trinh bac nhat 2 an");
        solve(1,2,3,4,5,6);
    }
    public static void solve(double a11, double a12, double b1, double a21, double a22, double b2) {
        double d = a11 * a22 - a21 * a12;
        double d1 = b1 *a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;
        if (d != 0.0) {
            System.out.println("x: " + d1 / d + "\ty: " + d2 / d);
        } else if (d == 0.0 && d1 != 0.0 && d2 != 0.0) {
            System.out.println("\nNo solution");
        } else if (d == d1 && d == d2 && d == 0.0) {
            System.out.println("Many roots");
        }

    }
}
