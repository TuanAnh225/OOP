import javax.swing.JOptionPane;

//2.2.5 Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
public class BT_2_2_5 {
        public static void main(String args[]) {
                String strNum1, strNum2;
                double num1, num2;
                // get number from user
                strNum1 = JOptionPane.showInputDialog(null, "please input the first number: ",
                                "Input the first number",
                                JOptionPane.INFORMATION_MESSAGE);
                strNum2 = JOptionPane.showInputDialog(null, "please input the second number: ",
                                "Input the second number",
                                JOptionPane.INFORMATION_MESSAGE);

                // convert to double
                num1 = Double.parseDouble(strNum1);
                num2 = Double.parseDouble(strNum2);

                // show result
                System.out.print(" Sum: " + (num1 + num2) + "\n");
                System.out.print(" Difference: " + (num1 - num2) + "\n");
                System.out.print(" Product: " + (num1 * num2) + "\n");
                // check if num2
                if (num2 != 0)
                        System.out.print(" Quotient: " + (num1 / num2) + "\n");
                else
                        System.out.print(" Can't caculate quotient because num2 = 0");

                System.exit(0);
        }

}
