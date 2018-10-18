import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class main
{
    private static String filePath = "emails.txt";
    private static int mailCounter = 0;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        while(true)
        {
            
            System.out.print("Enter name (type q to stop program): ");
            name = scanner.next();
            
            if(name.equals("q"))
            {
                
                if(Files.exists(Paths.get(filePath)))
                    showFileContents();
                
                System.exit(0);
            }
            
            System.out.print("Enter surname (type q to stop program): ");
            surname = scanner.next();
            
            if(surname.equals("q"))
            {
                
                if(Files.exists(Paths.get(filePath)))
                    showFileContents();
                
                System.exit(0);
            }
            
            saveDataToFile(new empo(name, surname));
        }
    }
    private static boolean checkIfPersonIsInFile(empo empo)
    {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            
            String textLine;
            while((textLine = bufferedReader.readLine()) != null)
            {
                
                textLine = textLine.substring(0, textLine.indexOf("@"));
                
                if(textLine.contains(empo.surname.trim().toLowerCase() + "." + empo.name.trim().toLowerCase()))
                    mailCounter++;
            }
            
            if(mailCounter > 0)
                return true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    private static void saveDataToFile(empo empo)
    {
        
        BufferedWriter bufferedWriter = null;
        String mail;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));

            if(checkIfPersonIsInFile(empo))
            {
                
                mail = empo.surname.trim().toLowerCase() + "." + empo.name.trim().toLowerCase() + mailCounter + "@mex.com";
                
                mailCounter = 0;
            }
            else
            {
                
                mail = empo.surname.trim().toLowerCase() + "." + empo.name.trim().toLowerCase() + "@mex.com";
            }
            
            bufferedWriter.write(mail);
            bufferedWriter.newLine();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void showFileContents()
    {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            
            System.out.println("Saved emails: ");
            String textLine;
            while((textLine = bufferedReader.readLine()) != null)
            {
                
                System.out.println(textLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
