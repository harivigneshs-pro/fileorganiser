//this file is for handling the file
import java.io.File;

public class FileHandler {
    protected String filePath;

    public FileHandler() {}

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }
    // Common method to scan files 
    public void scanFiles(String directoryPath) {
        File dir = new File(directoryPath);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory: " + directoryPath);
            return;
        }

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println("Found: " + file.getName());
            }
        }
    }
}

