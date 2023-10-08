import java.util.List;
import java.util.Date;

public class Dog {
//    private static int id;
//    List<String> vaccines;
//    private String name;
//
//    public Dog(String name, List<String > vaccines) {
//        this.name = name;
//        this.vaccines = vaccines;
//        ++id;
//    }
//
//    public List<String> getVaccines() {
//        return vaccines;
//    }
//
//    public void setVaccines(List<String> vaccines) {
//        this.vaccines = vaccines;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "vaccines=" + vaccines +
//                ", name='" + name + '\'' +
//                '}' + id;
//    }
    private String name;
    private String breed;
    private Integer age;
    private Date data;
    private Integer weight;
    private Boolean state;

    public Dog(String name, String breed, Integer age, Date data, Integer weight, Boolean state) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.data = data;
        this.weight = weight;
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", data=" + data +
                ", weight=" + weight +
                ", state=" + state +
                '}';
    }
}
