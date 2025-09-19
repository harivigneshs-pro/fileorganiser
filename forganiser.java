//this file is uesd to organise the file according to the hashing value and and formates
//it to change the structure of the file
import java.io.File;
public class FileOrganizer {
    String folderPath;
  public FileOrganizer(String path) {
        this.folderPath = path;
    }
  public void organizeFiles() {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
 if (files == null) {
            System.out.println("Folder not found!");
            return;
      }
for (File f : files) {
      if (f.isFile()) {
          String name = f.getName();
        String ext = "";
        int dot = name.lastIndexOf(".");
      if (dot != -1) {
                    ext = name.substring(dot + 1).toLowerCase();
                }
String category = "Others";
    if (ext.equals("jpg") || ext.equals("png"))
      category = "Images";
   else if (ext.equals("mp4"))
     category = "Videos";
   else if (ext.equals("pdf") || ext.equals("txt"))
     category = "Documents";
        File newFolder = new File(folderPath + "\\" + category);
                if (!newFolder.exists()) {
                    newFolder.mkdir();
                }
File newFile = new File(newFolder, f.getName());
 boolean moved = f.renameTo(newFile);
if (moved) {
                    System.out.println("Moved " + name + " to " + category);
       } else {
                    System.out.println("Could not move " + name);
                }
            }
        }
    }
}
