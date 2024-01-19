package Lr5;

import java.util.Random;

public class Task5 {

    private int student;

    public Task5() {
        this.student = 0;
    }

    public Task5(int student) {
        this.setStudent(student);
    }

    public int getStudent() {
        return this.student;
    }

    public void setStudent(int student) {
        if (student < 100){
            this.student = student;
        } else {
            this.student = 100;
        }
    }
}
