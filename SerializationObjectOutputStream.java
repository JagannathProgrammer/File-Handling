import java.io.*;
class Student4 implements Serializable{
    int age;
    String name;
    public Student4(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class SerializationObjectOutputStream {
    public static void main(String[] args) throws Exception{
        Student4 ST = new Student4(23, "Jagannath");
        ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("Student4.txt"));

        OOS.writeObject(ST);

        OOS.close();
        System.out.println("Serialization Written Seccessfully.");
    }
}
