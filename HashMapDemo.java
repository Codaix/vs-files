import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> employee = new HashMap<>();
        employee.put(106,"Tsunada");
        employee.put(107,"kakashi");
        employee.put(108, "Rock Lee");
        System.out.println("Employee with id 108: "+employee.get(108));
        employee.remove(108);
        for(var entry: employee.entrySet()){
        System.out.println("ID: "+entry.getKey()+ ", Name: "+ entry.getValue());
        }
    }   
}
