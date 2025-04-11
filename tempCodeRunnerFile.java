import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.dat"))){
            while(true){
                try{
                    Person person = (Person) ois.readObject();
                    System.out.println(person);

                }
                catch(EOFException e){
                    break;
                }
            }
        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}