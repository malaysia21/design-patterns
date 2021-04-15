package structural.facade;

public class FileWriter {

    public static void writePdfFile(File file){
        System.out.println("Generating PDF File: " + file);
    }

    public static void writeXlsFile(File file){
        System.out.println("Generating XLS File" + file);
    }
}
