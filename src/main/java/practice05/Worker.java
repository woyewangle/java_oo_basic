package practice05;


public class Worker extends Person {

    public Worker(String name, int age) {
        super( name, age);
    }

    public String basicIntroduce() {
        return super.introduce();
    }

    public String introduce(){
        return basicIntroduce()+" I am a Worker. I have a job.";
    }
}
