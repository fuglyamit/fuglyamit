package hello;


import java.io.*;
import java.util.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
public class heee {
   public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
      Employee emp1 = new Employee();
      emp1.setFirstName("Raja");
      emp1.setLastName("Ramesh");
      emp1.setId(115);
      emp1.getTechnologies().add("Java");
      emp1.getTechnologies().add("Selenium");
      emp1.getTechnologies().add("Spark");
      ObjectMapper mapper = new ObjectMapper();
      String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
      System.out.println(jsonStr);
      System.out.println("Deserializing JSON to Object:");
      Employee emp2 = mapper.readValue(jsonStr, Employee.class);
      System.out.println(emp2.getId() + " " + emp2.getFirstName() + " " + emp2.getLastName() + " " + emp2.getTechnologies());
   }
}
// Employee class
class Employee {
   private int id;
   private String firstName;
   private String lastName;
   private List technologies = new ArrayList<>();
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }  
   public List getTechnologies() {
      return technologies;
   }
   public void setTechnologies(List technologies) {
      this.technologies = technologies;
   }
}