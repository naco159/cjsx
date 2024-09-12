public class Person {
    private String name;
    private int age;
    private String rank;

    public Person(String name, int age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String getCity() {
        return rank;
    }

    public void setCity(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}';
    }
}