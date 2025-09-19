//this file is used to denerate report of how much file is organised and sorted,etc
import java.io.FileWriter;
import java.io.IOException;
public class ReportGenerator{
    public void writeReport(){
        FileWriter fw=new FileWriter("report.txt");
         fw.write("File Organizer Report\n");
        fw.write("Files organized into categories.\n");
        fw.write("Duplicate check completed.\n");
        fw.close();
        System.out.println("\nReport created: report.txt");}}
