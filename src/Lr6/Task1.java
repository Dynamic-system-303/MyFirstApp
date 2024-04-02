package Lr6;

public class Task1 {
    String str1;
    char ch1;

    public void setStr1orCh1 (String str1) {
        this.str1 = str1;
    }
    public void setStr1orCh1 (char ch1) {
        this.ch1 = ch1;
    }
    public void setStr1orCh1 (char[] chars) {
        if(chars.length == 1){
            this.ch1 = chars[0];
        } else if(chars.length > 1){
            this.str1 = String.valueOf(chars);
        }
    }
}
