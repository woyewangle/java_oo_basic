package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person implements AssignLeaderListener{
    //String name;
    //int age;
    LinkedList<Klass> classes;

    Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
        for (Klass klass:classes) {
            klass.addAssignLeaderListener(this);
        }
    }
    Teacher(int id, String name,int age){
        super(id, name,age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        String introduction = super.introduce();
        String number = "";
        if(classes == null){
            number = "No Class";
        }else{
            number = "Class ";
            for(Klass klass: classes )
                number += klass.number + ", ";
            number = number.substring(0,number.lastIndexOf(", "));
        }
        introduction += " I am a Teacher. I teach " + number + ".";
        return introduction;
    }

    public String introduceWith(Student student){
        String teach = "";
        if(isTeaching(student))
            teach = " I am a Teacher. I teach " + student.name + ".";
        else
            teach = " I am a Teacher. I don't teach " + student.name + ".";
        return super.introduce()+ teach;
    }
    public boolean isTeaching(Student student){
        boolean key =false;
        for( Klass klass: classes){
            if(klass == student.klass){
                key = true;
                break;
            }
        }
        return key;
    }

    public void notifyBecomeLeader(Student student,Klass klass){

        String joinStudent = "I am "+ name +". I know " + student.name + " become Leader of " + klass.getDisplayName() + ".\n";

        System.out.print(joinStudent);
    }

    public void notifyJoinStudent(Student student,Klass klass){

        String joinStudent = "I am "+ name +". I know " + student.name + " has joined " + klass.getDisplayName() + ".\n";

        System.out.print(joinStudent);
    }

}