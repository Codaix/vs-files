import java.util.*;
public class TreeSetComparable{
    public static void main(String[] args){
        TreeSet <Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(23);
        set.add(67);
        set.add(56);
        System.out.println(set);
    }
}
// class Person implements Comparable <Person>{
//     String name;
//     public Person(String name){
//         this.name = name;

//     }
//     @Override
//     public int compareTo(Person other){
//         return this.name.compareTo(other.name);
//     }
//     @Override
//     public String toString(){
//         return name;
//     }
// };
// public class TreeSetComparable {
//     public static void main(String[] args) {
//         TreeSet <Person> set = new TreeSet<>();
//         set.add(new Person("Alice"));
//         set.add(new Person("Ali"));
//         System.out.println(set);
//     }
// }
