import javax.swing.JOptionPane;

// 2.2.6

public class BT_2_2_6 {

    /**
     * Giai pt ax + b = 0
     */
    public static void firstDegreeEquation() {
        String strNum1, strNum2;
        double a, b;

        // ax + b = 0
        // get num from keyboard
        strNum1 = JOptionPane.showInputDialog(null, " please input a: ",
                "Input the number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, " please input b: ",
                "Input the number",
                JOptionPane.INFORMATION_MESSAGE);
        // convert to double
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        // check a
        if (a == 0)
            /*
             * if b == 0 => pt vo so nghiem
             * if b != 0 => pt vo nghiem
             */
            if (b != 0)
                JOptionPane.showMessageDialog(null, " PT vo nghiem",
                        "ax + b = 0 ", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, " PT vo so nghiem",
                        "ax + b = 0 ", JOptionPane.INFORMATION_MESSAGE);
        else
            // show result
            JOptionPane.showMessageDialog(null, "PT co nghiem x = " + (-b / a),
                    "ax + b = 0 ", JOptionPane.INFORMATION_MESSAGE);

    }

    /**
     * GiαΊ£i hα» pt 2 αΊ©n
     * π11π₯1+π12π₯2=π1
     * π21π₯1+π22π₯2=π2
     */
    public static void theSystemfirstDegreeEquation() {

        String num, expression = "π11π₯1+π12π₯2=π1 π21π₯1+π22π₯2=π2";
        double a[][] = new double[2][2]; // initialize an array with 4 numbers of a
        double b[] = new double[2]; // initialize an array with 2 numbers of b
        double D, Dx, Dy;

        // get data of array a from user
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // get num from keyboard
                num = JOptionPane.showInputDialog(null, "Enter a" + (i + 1) + "" + (j + 1) + ":",
                        expression,
                        JOptionPane.INFORMATION_MESSAGE);
                // convert to double
                a[i][j] = Double.parseDouble(num);
            }
        }

        // get data of array b from user
        for (int j = 0; j < 2; j++) {
            // get num from keyboard
            num = JOptionPane.showInputDialog(null, "Enter b" + (j + 1) + ":",
                    expression,
                    JOptionPane.INFORMATION_MESSAGE);
            // convert to double
            b[j] = Double.parseDouble(num);
        }

        /**
         * GiαΊ£i hα» pt 2 αΊ©n
         * π11π₯1+π12π₯2=π1
         * π21π₯1+π22π₯2=π2
         */

        // D = a11*a22 - a21*a12;
        D = a[0][0] * a[1][1] - a[1][0] * a[0][1];

        // Dx = b1*a22 - b2*a12
        Dx = b[0] * a[1][1] - b[1] * a[0][1];

        // Dy = a11*b2 - a21*b1
        Dy = a[0][0] * b[1] - a[1][0] * b[0];

        // NαΊΏu D = Dx = Dy = 0 thΓ¬ hα» cΓ³ vΓ΄ sα» nghiα»m
        // D = 0, Dx != 0 hoαΊ·c Dy !=0 hα» vΓ΄ nghiα»m
        // D != 0 hα» cΓ³ nghiα»m

        if (D == Dx && Dx == Dy && Dx == 0)
            JOptionPane.showMessageDialog(null, "Hα» cΓ³ vΓ΄ sα» nghiα»m",
                    expression, JOptionPane.INFORMATION_MESSAGE);
        else if (D == 0 && (Dx != 0 || Dy != 0))
            JOptionPane.showMessageDialog(null, " Hα»  vΓ΄  nghiα»m",
                    expression, JOptionPane.INFORMATION_MESSAGE);
        else {
            // x = Dx / D
            // y = Dy / D
            JOptionPane.showMessageDialog(null, "Hα» cΓ³ nghiα»m x = " + (Dx / D) + " y = " + (Dy / D),
                    expression, JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * GiαΊ£i phΖ°Ζ‘ng trΓ¬nh bαΊ­c 2 ax^2 + bx + c = 0
     */
    public static void seconDegreeEquation() {
        String strNum1, strNum2, strNum3;
        double a, b, c, delta, x1, x2;
        String expression = "ax^2 + bx + c = 0";

        // GiαΊ£i phΖ°Ζ‘ng trΓ¬nh bαΊ­c 2 ax^2 + bx + c = 0
        // get num from keyboard
        strNum1 = JOptionPane.showInputDialog(null, "please input a: ",
                expression,
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "please input b: ",
                expression,
                JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "please input c: ",
                expression,
                JOptionPane.INFORMATION_MESSAGE);

        // convert to double
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        c = Double.parseDouble(strNum3);

        /*
         * NαΊΏu a == 0
         * + NαΊΏu b == 0 vΓ  c != 0 => vΓ΄ nghiα»m
         * + NαΊΏu b == 0 vΓ  c == 0 pt vΓ΄ sα» nghiα»m
         * + NαΊΏu b != 0 thΓ¬ pt cΓ³ nghiα»m -c / b
         */
        if (a == 0) {
            if (b == 0)
                if (c != 0)
                    JOptionPane.showMessageDialog(null, " PT vΓ΄ nghiα»m",
                            expression, JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, " PT vΓ΄ sα» nghiα»m",
                            expression, JOptionPane.INFORMATION_MESSAGE);
            else
                // show result
                JOptionPane.showMessageDialog(null, " PT co nghiem x = " + (-c / b),
                        expression, JOptionPane.INFORMATION_MESSAGE);
        } else {
            /*
             * NαΊΏu a != 0 => delta = b^2 - 4ac
             * + delta < 0 -> pt vΓ΄ nghiα»m
             * + delta == 0 -> pt cΓ³ nghiα»m duy nhαΊ₯t x = -b/2a
             * + delta > 0 -> pt cΓ³ 2 nghiα»m phΓ’n biα»t x1 = ( -b - sqrt(delta) ) / 2a
             * x2 = ( -b + sqrt(delta) ) / 2a
             */
            // caculate delta
            delta = b * b - 4 * a * c;
            if (delta < 0)
                // show result
                JOptionPane.showMessageDialog(null, " PT vΓ΄ nghiα»m",
                        expression, JOptionPane.INFORMATION_MESSAGE);
            else if (delta == 0)
                // show result
                JOptionPane.showMessageDialog(null, " PT cΓ³ nghiα»m duy nhαΊ₯t x = " + (-b / (2 / a)),
                        expression, JOptionPane.INFORMATION_MESSAGE);
            else {
                // caculate x1 and x2
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                // show result
                JOptionPane.showMessageDialog(null,
                        " PT cΓ³ 2 nghiα»m phΓ’n biα»t x1 = " + x1 + " x2 = " + x2,
                        expression, JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }

    public static void main(String args[]) {
        boolean exit = false;
        int choose;
        String strNum2;
        String context = " Enter number :\n";
        context += "1. GiαΊ£i phΖ°Ζ‘ng trΓ¬nh bαΊ­c 1\n";
        context += "2. GiαΊ£i hα» phΖ°Ζ‘ng trΓ¬nh bαΊ­c 1\n";
        context += "3. GiαΊ£i phΖ°Ζ‘ng trΓ¬nh bαΊ­c 2\n";
        context += "4. ThoΓ‘t\n";

        // if exit == fasle thα»±c hiα»n lαΊ·p ngΖ°α»£c lαΊ‘i sαΊ½ kαΊΏt thΓΊc
        do {
            // get num from keyboard
            strNum2 = JOptionPane.showInputDialog(null, "\n" + context,
                    "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
            // convert to int
            choose = Integer.parseInt(strNum2);
            /*
             * choose == 1 GiαΊ£i phΖ°Ζ‘ng trΓ¬nh bαΊ­c 1
             * choose == 2 GiαΊ£i hα» phΖ°Ζ‘ng trΓ¬nh bαΊ­c 1
             * choose == 3 GiαΊ£i phΖ°Ζ‘ng trΓ¬nh bαΊ­c 2
             * choose == 4 ThoΓ‘t
             */
            switch (choose) {
                case 1:
                    firstDegreeEquation();
                    break;
                case 2:
                    theSystemfirstDegreeEquation();
                    break;
                case 3:
                    seconDegreeEquation();
                    break;
                case 4:
                    exit = true;
                    break;
            }

        } while (!exit);

        System.exit(0);
    }

}
