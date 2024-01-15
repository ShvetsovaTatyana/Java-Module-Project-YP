public class Formatter {
    public static String rubl(double sum) {
        String b = "";
        sum = Math.floor(sum);
        if (sum % 100 >= 11 && sum % 100 <= 19) {
            b = "рублей";
            return b;
        }
        if (sum % 10 == 1)
            b = "рубль";
        if (sum % 10 > 1 && sum % 10 < 5)
            b = "рубля";
        if (sum % 10 == 0 || sum % 10 > 4)
            b = "рублей";
        return b;
    }
}
