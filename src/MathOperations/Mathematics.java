package MathOperations;

import java.text.DecimalFormat;

public class Mathematics {
    public static void main(String[] args) {
        double x = 4.456;
        System.out.println((int)x);
        System.out.println(new DecimalFormat("#.#").format(x));
        System.out.println(Math.round(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
    }
}
