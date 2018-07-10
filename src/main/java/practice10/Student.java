package practice10;


public class Student extends Person {
    Klass klass=null;
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass=klass;
    }

    public String basicIntroduce() {
        return super.introduce();
    }
    public String introduce(){
        String classString=(this.klass.getLeader()==null)?"at Class "+this.klass.getNumber():
        "Leader of Class "+this.klass.getNumber();

        return  basicIntroduce()+" I am a Student. I am "+classString+".";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
