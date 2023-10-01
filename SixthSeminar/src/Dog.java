import java.util.List;

public class Dog {
    private static int id;
    List<String> vaccines;
    private String name;

    public Dog(String name, List<String > vaccines) {
        this.name = name;
        this.vaccines = vaccines;
        ++id;
    }

    public List<String> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<String> vaccines) {
        this.vaccines = vaccines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccines=" + vaccines +
                ", name='" + name + '\'' +
                '}' + id;
    }
}
