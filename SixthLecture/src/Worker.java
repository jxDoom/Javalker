import java.util.Objects;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
//        return "Worker{" +
//                "id=" + id +
//                ", salary=" + salary +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
        String res = String.format("id: %d, fn: %s, ln: %s, s: %d", id, firstName, lastName, salary);
        return res;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Worker worker = (Worker) o;
//        return id == worker.id && salary == worker.salary && Objects.equals(firstName, worker.firstName) && Objects.equals(lastName, worker.lastName);
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id, salary, firstName, lastName);
        return id;
    }
}
