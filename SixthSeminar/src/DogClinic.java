import java.util.ArrayList;
import java.util.List;

public class DogClinic {
    private List<Dog> clinic = new ArrayList<>();

    public void checkDog(Dog dog){
        if (dog.getState()){
            clinic.add(dog);
            System.out.println(clinic);
        }else System.out.println("Собака " + dog.getName() + " здорова");

    }

}
