package practice11;

public class Student extends Person{
    public int id;
    public String name;
    public Klass klass;

    Student(int id, String name,int age, Klass klass){
        super(id,name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String introduction = super.introduce();
        introduction += " I am a Student.";
        if(isLeader()){
            introduction += " I am Leader of "+ klass.getDisplayName() +".";
        }else{
            introduction += " I am at "+ klass.getDisplayName() +".";
        }

        return introduction;
    }

    private boolean isLeader(){
        return klass.getLeader() == this;
    }
}