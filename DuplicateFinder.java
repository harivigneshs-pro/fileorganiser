//this file is to remove duplicate files using hashset
//the file initially finds the duplicates  tecniques
import java.io.File;
import java.util.HashSet;
public class DuplicateFinder{
    String folderPath;
    public DuplicateFinder(String path){
        this.folderPath=path;
    }
    public void findDuplicates(){
        File folder=new File(folderPath);
        File[] files=folder.listFiles();//listFiles a built in method for listing all the files in a folder
        if (files==null) 
                return;
        HashSet<String> seen=new HashSet<>();
         System.out.println("\nChecking duplicates...");
        for (File f : files){
            if (f.isFile()){
                String name=f.getName();//fetches name of the file 
                if (seen.contains(name)){
                    //contains-built in method to check value present or not
                    System.out.println("Duplicate found: " + name);
                } else{
                    seen.add(name);
                }
            }
        }
    }
}

