package in.AryanCoding.equals;

import java.util.Objects;

public class person {

    private String name;
    private int age;
    private String id;


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof person)) return false;
        person person = (person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
