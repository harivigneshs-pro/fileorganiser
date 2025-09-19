import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Change this folder path to where you want to test
        String folderPath = "C:\\Users\\Hari Vignesh S\\OneDrive\\Desktop\\testfiles2";
        // Step 1: Organize files
        FileOrganizer fo = new FileOrganizer(folderPath);
        fo.organizeFiles();

        // Step 2: Check for duplicates
        final DuplicateFinder df = new DuplicateFinder(folderPath);
        df.findDuplicates();

        // Step 3: Write a report
        ReportGenerator rg = new ReportGenerator();
        rg.writeReport();
    }
}
