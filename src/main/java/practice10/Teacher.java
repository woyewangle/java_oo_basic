package practice10;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    Klass klass=null;
    LinkedList<Klass> classes = new LinkedList<Klass>();
    public Teacher(int id ,String name, int age) {
        super(id,name, age);
    }

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass=klass;
    }

    public Teacher(int id,String name, int age,LinkedList<Klass> classes) {
        super(id,name, age);
        this.klass=klass;
        this.classes=classes;
        System.out.println("1"+this.classes);
    }



    public String basicIntroduce(){
        return super.introduce();
    }

    @Override
    public String introduce() {
        //String teachString=(this.klass==null)?"No Class":"Class "+klass.getNumber();
        String teachString="No Class";
        if(this.classes.size()!=0){
            List classesStr=this.classes.parallelStream().map(x->x.getNumber()).collect(Collectors.toList());//{2,3}
            System.out.println(classesStr);
            String classString="";
            for(int i=0;i<classesStr.size();i++){
                classString+=classesStr.get(i);
                classString = classString + ", ";
            }
            teachString="Class "+classString.substring(0,classString.length()-2);
        }
        return  basicIntroduce()+" I am a Teacher. I teach "+teachString+".";
    }

    public String introduceWith(Student student){


        //String teachOthers=(student.getKlass()==this.klass)?"teach ":"don't teach ";
        String teachOthers=(isTeaching(student))?"teach ":"don't teach ";
        return basicIntroduce()+" I am a Teacher. I "+teachOthers+student.getName()+".";


    }

    public Boolean isTeaching(Student student){
        Boolean isTeach=false;
        List classesStr=this.classes.parallelStream().map(x->x.getNumber()).collect(Collectors.toList());//{2,3}
        if(classesStr.contains(student.getKlass().getNumber())) {
            isTeach=true;
        }
        return isTeach;
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }
}
