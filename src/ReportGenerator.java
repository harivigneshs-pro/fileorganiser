import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    public void writeReport() {
        try {
            FileWriter fw = new FileWriter("report.txt");
            fw.write("File Organizer Report\n");
            fw.write("Files organized into categories.\n");
            fw.write("Duplicate check completed.\n");
            fw.close();
            System.out.println("\nReport created: report.txt");
        } catch (IOException e) {
            System.out.println("Error writing report.");
        }
    }
}
