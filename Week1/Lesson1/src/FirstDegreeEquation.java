import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class FirstDegreeEquation {
    public static void main(String[] args) {
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


    }
}
