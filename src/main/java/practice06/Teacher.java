package practice06;

public class Teacher extends Person{
    int klass;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    public String basicIntroduce(){
        return super.introduce();
    }

    @Override
    public String introduce() {
        String teachString=(this.klass==0)?"No Class.":"Class "+this.klass+".";
        return  basicIntroduce()+" I am a Teacher. I teach "+teachString;
    }


    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
