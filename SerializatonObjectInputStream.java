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
public class SerializatonObjectInputStream {
    public static void main(String[] args) throws Exception{
        ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("Student4.txt"));

        Student4 ST =(Student4)OIS.readObject();

        OIS.close();

        System.out.println(ST.getAge()+" "+ST.getName());
        System.out.println("Serialization Show Successfully.");
    }
}
