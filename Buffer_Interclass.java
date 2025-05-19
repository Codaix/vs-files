import java.io.*;

class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    @Override
    public String toString(){
        return "Person(name = "+name+" age = "+age+")";
    }

    
}
class Buffer_Interclass{
    public static void main(String[] args) {
        Person person = new Person("CyroXD",69);
        System.out.println(person);
    }
}

try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))){
    Person person = new Person ("Alice ", 34);
    oos.writeObject(person);
    System.out.println("Object Oriented Succesfully.");
}
    catch(Exception e){
        System.out.println("Exception");
}