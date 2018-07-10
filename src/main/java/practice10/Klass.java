package practice10;


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
        if(student.getKlass().getNumber()==this.number) {
            this.Leader = student;
            return "I am Leader of Class " + student.getKlass().getNumber() + ".";
        }else {
            System.out.print("It is not one of us.\n");
            return "";
        }
    }

    public void appendMember(Student student){
        if(student.getKlass().getNumber()!=this.number){
            this.number=student.getKlass().getNumber();
        }
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
