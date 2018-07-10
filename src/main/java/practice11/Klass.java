package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements JoinListener{
    int number;
    Student leader;
    private List<AssignLeaderListener> signLeaderListener = new ArrayList<AssignLeaderListener>();

    public void addAssignLeaderListener(AssignLeaderListener assignLeaderListener){
        signLeaderListener.add(assignLeaderListener);
    };

    Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public void assignLeader(Student student){
        if(isIn(student)){
            leader = student;
            signLeaderListener.forEach(l->l.notifyBecomeLeader(student,this));
        }
        else
            System.out.print("It is not one of us.\n");
    }
    public void appendMember(Student student){
        this.changeClass(student);
        signLeaderListener.forEach(l->l.notifyJoinStudent(student,this));
    }
    private void changeClass(Student student){
        student.klass = this;
    }
    private boolean isIn(Student student){
        return this == student.klass;
    }
}

