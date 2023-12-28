package Lr3;

public class Test7 {
    public static void main(String[] args) {
        int n = 10;
        char[] charArray = new char[n];
        char bukva = 'а';

        for (int i = 0; i < charArray.length; i++){
            charArray[i] = bukva;
            bukva+=2;
            System.out.print(charArray[i] + "\t");
        }

        System.out.println();
        for (int i = charArray.length - 1 ; i >= 0; i--){
            System.out.print(charArray[i] + "\t");
        }
    }
}
