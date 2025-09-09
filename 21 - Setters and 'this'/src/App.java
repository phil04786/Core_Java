/*
class Frog {
    String name;
    int age;
     
    public void setName(String newName) {
        name = newName;
    }
     
    public void setAge(int newAge) {
        age = newAge;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
         
        //frog1.name = "Bertie";
        //frog1.age = 1;
         
        frog1.setName("Bertie");
        frog1.setAge(1);
         
        System.out.println(frog1.getName());
    }
 
}
*/


class Frog {
    //Encapsulation
    private String name;
    private int age;
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public String getName() {
        return name;            //instance variable is still accessible no ambuigty of instance and local variable between brackets
    }
     
    public int getAge() {
        return age;             //instance variable is still accessible no ambuigty  of instance and local variable between brackets
    }
     
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();        //Particular Frog or particular object
         
        //frog1.name = "Bertie";
        //frog1.age = 1;
         
        frog1.setName("Bertie");
        frog1.setAge(1);
         
        System.out.println(frog1.getName());
    }
 
}