package practice11;

import java.util.Objects;

public class Person {
    public int id;
    public String name;
    public int age;

    Person(){}

    Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age);
    }

    public String introduce(){
        String introduction = "My name is "+ name +". I am "+ age +" years old.";
        return introduction;
    }
}
