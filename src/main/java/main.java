import com.es2.trabalhofinal.Alimentos;
import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World 123");

        //CSVClass cv = new CSVClass();
        CSVClass al = new CSVClass();


        try {
            //cv.readCSV();
            al.readCSValimentos();
        } catch (FileNotFoundException e){
            System.out.println("File don't found");
        }

        /*cv.writeCSV();*/
    }
}