import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Hari\\Downloads";

        FileOrganizer fo = new FileOrganizer(folderPath);
        fo.organizeFiles();

        DuplicateFinder df = new DuplicateFinder(folderPath);
        df.findDuplicates();

        ReportGenerator rg = new ReportGenerator();
        rg.writeReport();
    }
}
