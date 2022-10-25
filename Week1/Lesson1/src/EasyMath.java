import javax.swing.*;

public class EasyMath {
    public static void main(String[] args) {
        String strNum1,strNum2;
        double num1,num2,sum,dif,product,quotient;
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ",JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        sum = num1 + num2;
        dif = num1 - num2;
        product = num1*num2;
        quotient = num1/num2;
        String strNotification = "Sum: " + sum + "\n" + "Difference: " + dif + "\n" + "Product: " + product + "\n" + "Quotient: " + quotient;
        JOptionPane.showMessageDialog(null,strNotification,"Result\n",JOptionPane.INFORMATION_MESSAGE);

    }
}
