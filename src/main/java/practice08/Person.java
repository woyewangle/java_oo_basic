package practice08;

public class Person {
    String name;
    int age;
    int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }


    public  String introduce(){
        return  "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

