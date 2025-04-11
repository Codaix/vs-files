import java.io.*;


public class Input_Otput_Stream {
    public static void main(String[] args) {
    try(FileInputStream fis = new FileInputStream("input.txt");
    FileOutputStream fos = new FileOutputStream("output.txt")){
        int data;
        while((data = fis.read())!= -1){
            fos.write(data);
        }
    }
    catch(Exception e){
        System.out.println("Error!");
    }

    // try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.dat"))){
    //     int data;

    //     Person person = (Person).ois.readObject();
    //     System.out.println(); 
    // }
//     try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))){
//     Person person = new Person ("Alice ", 34);
//     oos.writeObject(person);
//     System.out.println("Object Oriented Succesfully.");
// }
//     catch(Exception e){
//         System.out.println("Exception");
// }
    }
}
