package lab5;

import java.io.*;
import java.util.ArrayList;

public class Main
{
    private static ArrayList<AccountNumber> accountNumbers = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("src/lab5/bank_ocr_dojo_us1");
        int numberOfLines = getNumberOfLinesInFile(file);

        for(int i = 0; i < 10; i++)
            accountNumbers.add(new AccountNumber(i, createArrayWithNumber(i)));

        // Read account numbers
        for(int lineNumber = 0; lineNumber < numberOfLines; lineNumber += 4)
        {
            readNumberFromFile(file, lineNumber);
            System.out.println("---------");
        }
    }

    private static String[][] createArrayWithNumber(int number)
    {
        String[][] array = new String[3][3];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
                array[i][j] = " ";
        }

        switch(number)
        {
            case 0:
                array[0][1] = "_";
                array[1][0] = "|";
                array[1][2] = "|";
                array[2][0] = "|";
                array[2][1] = "_";
                array[2][2] = "|";
                break;
            case 1:
                array[1][2] = "|";
                array[2][2] = "|";
                break;
            case 2:
                array[0][1] = "_";
                array[1][1] = "_";
                array[1][2] = "|";
                array[2][0] = "|";
                array[2][1] = "_";
                break;
            case 3:
                array[0][1] = "_";
                array[1][1] = "_";
                array[1][2] = "|";
                array[2][1] = "_";
                array[2][2] = "|";
                break;
            case 4:
                array[1][0] = "|";
                array[1][1] = "_";
                array[1][2] = "|";
                array[2][2] = "|";
                break;
            case 5:
                array[0][1] = "_";
                array[1][0] = "|";
                array[1][1] = "_";
                array[2][1] = "_";
                array[2][2] = "|";
                break;
            case 6:
                array[0][1] = "_";
                array[1][0] = "|";
                array[1][1] = "_";
                array[2][0] = "|";
                array[2][1] = "_";
                array[2][2] = "|";
                break;
            case 7:
                array[0][1] = "_";
                array[1][2] = "|";
                array[2][2] = "|";
                break;
            case 8:
                array[0][1] = "_";
                array[1][0] = "|";
                array[1][1] = "_";
                array[1][2] = "|";
                array[2][0] = "|";
                array[2][1] = "_";
                array[2][2] = "|";
                break;
            case 9:
                array[0][1] = "_";
                array[1][0] = "|";
                array[1][1] = "_";
                array[1][2] = "|";
                array[2][1] = "_";
                array[2][2] = "|";
                break;
        }
        return array;
    }

    private static void readNumberFromFile(File file, int startLine)
    {
        BufferedReader bufferedReader = null;
        int checksum = 0;
        try {
            String temp;
            String[][] values = new String[3][3];

            for(int i = 0; i <= 8; i++)
            {
                bufferedReader = new BufferedReader(new FileReader(file));

                // Skip lines
                for(int line = 0; line < startLine; line++)
                {
                    bufferedReader.readLine();
                }

                int columnNumber = 0;
                switch(i)
                {
                    case 0:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 1:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 2;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 2:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 4;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 3:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 6;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 4:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 8;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 5:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 10;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 6:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 12;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 7:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 14;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                    case 8:
                        for (int j = 0; j < 3; j++)
                        {
                            temp = bufferedReader.readLine();

                            columnNumber = i + 16;

                            values[j][0] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber, columnNumber + 1);
                            values[j][1] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 1, columnNumber + 2);
                            values[j][2] = (temp.trim().isEmpty()) ? " " : temp.substring(columnNumber + 2, columnNumber + 3);
                        }
                        break;
                }

                // Print account number
                if(i != 8)
                {
                    System.out.print(getAccountNumberFromText(values));
                }
                else
                {
                    System.out.println(getAccountNumberFromText(values));
                }

                bufferedReader.close();

                // Calculate checksum
                if(i == 8)
                    checksum += getAccountNumberFromText(values);
                else
                    checksum += getAccountNumberFromText(values) * (9 - i);
            }

            // Check account checksum
            System.out.println("Account number status: " + (checkIfAccountChecksumIsValid(checksum) ? "VALID" : "INVALID (checksum % 11 != 0)"));
        } catch(IOException e) {
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

    private static int getAccountNumberFromText(String[][] text)
    {
        int accountNumber = -1;
        AccountNumber tempAccountNumber = accountNumbers.get(0);
        int correctPatternCounter;

        // Search list for proper number
        for(AccountNumber number : accountNumbers)
        {
            correctPatternCounter = 0;
            for(int i = 0; i < text.length; i++)
            {
                for(int j = 0; j < text.length; j++)
                {
                    if(number.getPattern()[i][j].contains(text[i][j]))
                    {
                        correctPatternCounter++;

                        tempAccountNumber = number;
                    }
                    else
                    {
                        correctPatternCounter--;
                    }
                }
            }

            if(correctPatternCounter == 9)
            {
                accountNumber = tempAccountNumber.getNumber();
                break;
            }
        }
        return accountNumber;
    }

    private static int getNumberOfLinesInFile(File file)
    {
        int numberOfLines = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while(bufferedReader.readLine() != null)
                numberOfLines++;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return numberOfLines;
    }

    private static boolean checkIfAccountChecksumIsValid(int accountChecksum)
    {
//        boolean accountNumberIsValid = false;

//        switch(accountChecksum % 11)
//        {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//                accountNumberIsValid = true;
//                break;
//        }
//        return accountNumberIsValid;
        return accountChecksum % 11 == 0;
    }
}
