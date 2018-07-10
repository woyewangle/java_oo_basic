package practice07;


public class Student extends Person {
    Klass klass=null;
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }
    public String basicIntroduce() {
        return super.introduce();
    }
    public String introduce(){
        return  basicIntroduce()+" I am a Student. I am at Class "+this.klass.getNumber()+".";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
