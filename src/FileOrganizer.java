import java.io.File;

public class FileOrganizer {
    String folderPath;

    public FileOrganizer(String path) {
        this.folderPath = path;
    }

    public void organizeFiles() {
        File folder=new File(folderPath);
        File[] files=folder.listFiles();

        if (files==null) {
            System.out.println("Folder not found!");
            return;
        }

        for (File f : files) {
            if (f.isFile()) {
                String name= f.getName();
                String ext= "";

                int dot=name.lastIndexOf(".");
                if (dot!=-1) {
                    ext=name.substring(dot + 1).toLowerCase();
                }

                String categry = "Others";
                if (ext.equals("jpg")||ext.equals("png")) 
                categry = "Images";
                else if (ext.equals("mp4"))
                 categry = "Videos";
                else if (ext.equals("pdf")||ext.equals("txt")) 
                categry = "Documents";

                File newFolder = new File(folderPath + "\\" + categry);
                if (!newFolder.exists()) {
                    newFolder.mkdir();
                }

                File newFile = new File(newFolder, f.getName());
                boolean moved = f.renameTo(newFile);
                if (moved) {
                    System.out.println("Moved " + name + " to " + categry);
                } else {
                    System.out.println("Could not move " + name);
                }
            }
        }
    }
}
