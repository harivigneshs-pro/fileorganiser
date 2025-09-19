import java.io.File;
import java.util.HashSet;

public class DuplicateFinder {
    String folderPath;

    // ✅ Constructor (not class header!)
    public DuplicateFinder(String path) {
        this.folderPath = path;
    }

    public void findDuplicates() {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null) return;

        HashSet<String> seen = new HashSet<>();

        System.out.println("\nChecking duplicates...");
        for (File f : files) {
            if (f.isFile()) {
                String name = f.getName();
                if (seen.contains(name)) {
                    System.out.println("Duplicate found: " + name);
                } else {
                    seen.add(name);
                }
            }
        }
    }
}
