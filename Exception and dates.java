// Online Java Compiler
// Use this editor to write, compile and run your Java code online\
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(LocalDate.now().format(format1));
        LocalDate parsedDate = LocalDate.parse("12-01-2025",format1);
        System.out.println(parsedDate);
        try{
        int result = 10/0;
        } catch(ArithmeticException e)
        {
            System.out.println("Error!!!!!!");
        } finally{
            System.out.println("Execution completed.");
        }
        try{
                int result = 10/0;
            try{
                int result1 = 10/0;
            }catch(ArithmeticException e){
                System.out.println("Inner Catch: Division by zero.");
            }
        }catch (Exception e){
            System.out.println("Outer Catch: General exeption");
        }
        
    }
}