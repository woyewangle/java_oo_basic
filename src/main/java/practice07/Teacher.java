package practice07;

public class Teacher extends Person {
    Klass klass=null;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age,Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public String basicIntroduce(){
        return super.introduce();
    }

    @Override
    public String introduce() {
        String teachString=(this.klass==null)?"No Class.":"Class "+klass.getNumber()+".";
        return  basicIntroduce()+" I am a Teacher. I teach "+teachString;
    }

    public String introduceWith(Student student){
        String teachOthers=(student.getKlass()==this.klass)?"teach ":"don't teach ";
        return basicIntroduce()+" I am a Teacher. I "+teachOthers+student.getName()+".";
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
