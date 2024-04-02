package Lr6;

public class main1 {
    public static void main(String[] args) {

        Task1 task1 = new Task1();

        task1.setStr1orCh1('T');
        task1.setStr1orCh1("Привет");

        System.out.println(task1.ch1);
        System.out.println(task1.str1);

        char[] chars1 = new char[5];
        chars1[0] = 'п';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';
        task1.setStr1orCh1(chars1);
        System.out.println(task1.str1);

        char[] chars2 = new char[1];
        chars2[0] = 'ц';

        task1.setStr1orCh1(chars2);
        System.out.println(task1.ch1);
    }
}
