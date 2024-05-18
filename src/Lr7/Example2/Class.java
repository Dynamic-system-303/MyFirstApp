package Lr7.Example2;

public class Class {
    //приватным текстовым полем.
    private String str1;

    Class() {setStr1();}
    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    Class (String str1){setStr1(str1);}
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }
    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length(){
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str1.length();
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() +
                '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return ClassNameAndFieldValue;
    }
}

