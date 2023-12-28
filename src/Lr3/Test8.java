package Lr3;

public class Test8 {

    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        String badsymb = "AEYUIO";
        char bukva = 'A';

        int i = 0;
        while (i < charArray.length) {
            int symbidx = badsymb.indexOf(bukva);
            if (symbidx == -1) {
                charArray[i] = bukva;
                System.out.print(charArray[i] + "\t");
                i++;
            }
            bukva++;
        }
    }
}