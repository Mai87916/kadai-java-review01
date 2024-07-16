
public class Review01 {

    public static void main(String[] args) {
        double num1 = 1500;
        double result;
        result = tax(num1);
        System.out.println(Math.round(num1) + "の商品の税込価格は" + Math.round(result) + "(消費税は" + Math.round(num1 * 0.1) + "円）です。");
    }

    public static double tax(double num1) {
        double result = num1 + (num1 * 0.1);
        return result;
    }

}
