package Lr5;

public class Task6 {

    private int min, max = 1;

    public void setMin(int min) {
        if (min < this.max) {
            this.min = min;
        }
    }

    public void setMax(int max) {
        if (max > this.min) {
            this.max = max;
        }
    }

    public void setVal(int num) {
        if (num < this.min) {
            this.min = num;
        }
        if (num > this.max) {
            this.max = num;
        }
    }

    public void setVal(int num1, int num2) {
        int minNum, maxNum;
        if (num1 <= num2) {
            minNum = num1;
            maxNum = num2;
        } else {
            minNum = num2;
            maxNum = num1;
        }
        if (minNum < this.min) {
            this.min = minNum;
        }
        if (maxNum > this.max) {
            this.max = maxNum;
        }
    }

    public void getMinMax() {
        System.out.println(this.min);
        System.out.println(this.max);
    }
}
