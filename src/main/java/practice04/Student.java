package practice04;

import practice03.Person;

public class Student extends Person {
    int klass;
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass=klass;
    }
    public String basicIntroduce() {
        return super.introduce();
    }
    public String introduce(){
        return  basicIntroduce()+" I am a Student. I am at Class "+this.klass+".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
