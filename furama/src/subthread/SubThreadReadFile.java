package subthread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SubThreadReadFile implements Runnable {
    private int ele;

    public static void readFileContainsCustomer() {
        File fileObject = new File("/Users/hathienvan/Downloads/ResortRequirement.txt.docx");
        try {
            System.out.println("Read  File.");
            FileReader fileReader = new FileReader(fileObject);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        File fileOblject = new File("/Users/hathienvan/Downloads/ResortRequirement.txt.docx");
        try {
            System.out.println("Read  File.");
            FileReader fileReader = new FileReader(fileOblject);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
