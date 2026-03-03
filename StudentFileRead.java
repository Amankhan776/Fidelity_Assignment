import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class StudentFileRead {
 
    public static void main(String[] args) {
 
        try {
 
            
            File file = new File("/home/labuser/Desktop/students.txt");
 
            
            if (!file.exists()) {
                System.out.println("students.txt file not found");
                return;  
            }
 
           
            FileReader fr = new FileReader(file);
 
            String data = "";
            int ch;
 
            
            while ((ch = fr.read()) != -1) {
                data = data + (char) ch;
            }
 
            fr.close();
 
            
            String[] lines = data.split("\n");
 
            
            for (int i = 1; i < lines.length; i++) {
 
                String line = lines[i].trim();
 
                if (!line.isEmpty()) {
 
                    String[] parts = line.split(",");
 
                    int rollNo = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int marks = Integer.parseInt(parts[2]);
 
                    
                    System.out.println("Roll No : " + rollNo);
                    System.out.println("Name    : " + name);
                    System.out.println("Marks   : " + marks);
                    System.out.println("---------------------");
                }
            }
 
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
