import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SpecialisationWithMulti {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.dat"))){
            oos.writeObject(new Person("Alice",30));
            oos.writeObject(new Person("Bob",35));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error!!!!");
        }
    }
}
