package practice08;

public class Klass {
    int number;
    Student Leader=null;

    public Klass(int number) {
        this.number = number;
    }

    public  String assignLeader(){
        return "";
    }

    public  String assignLeader(Student student){
        this.Leader=student;
        return "I am Leader of Class "+student.getKlass().getNumber()+".";
    }

    public String getDisplayName(){
        return "Class "+this.number+"";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return Leader;
    }

    public void setLeader(Student leader) {
        Leader = leader;
    }
}
