public class Formatter {
    public static String rubl(double sum) {
        String b = "";
        if (sum % 10 == 1)
            b = "рубль";
        if (sum % 10 > 1 && sum % 10 < 5)
            b = "рубля";
        if (sum % 10 == 0 || sum % 10 > 4)
            b = "рублей";
        return b;
    }
}
