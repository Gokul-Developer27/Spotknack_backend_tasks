import java.io.*;
//importing files for writing and reading

public class De_serialize {
    public static void main(String[] args) throws IOException {
        //since we are using io packages,,we use IOexception

        // Buffered reader reads data line by line from CSV file
        BufferedReader a = new BufferedReader(new FileReader("students.csv"));

        String Line;
        while ((Line = a.readLine()) != null) {
            System.out.println(Line);
        }
        a.close();

        // Writes the datas to CSV file
        FileWriter b = new FileWriter("output.csv");
        b.write("104,Gokul,20\n");
        b.write("105,Arun,21\n");
        b.close();

        System.out.println("Vice-Versa is done");
    }
}