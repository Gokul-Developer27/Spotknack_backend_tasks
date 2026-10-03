import java.sql.*;
//since we are using the sql code for the database connection
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Department: ");
        String department = sc.next();

        Student s = new Student(id, name, age, department);

        try {
            Connection con = DriverManager.getConnection(
                    //connection method to connect with postgresql
                    "jdbc:postgresql://localhost:5432/student_db",
                    "postgres",
                    "gokul@2006");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO students VALUES (?, ?, ?, ?)");

            ps.setInt(1, s.id);
            ps.setString(2, s.name);
            ps.setInt(3, s.age);
            ps.setString(4, s.department);

            ps.executeUpdate();

            System.out.println("Student saved successfully");

            //if any of the info is incorrect,the error handling exception will return error msg
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
