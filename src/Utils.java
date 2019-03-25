import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {


    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

//

    public static ArrayList<ElectionData> parseResults2016Elections(String data) {
        ArrayList<ElectionData> output = new ArrayList<>();
        String[] separatedByLines = data.split("\n");
        ArrayList<String> lineVals = new ArrayList<>();
        for (int line = 1; line < separatedByLines.length; line++) {
            lineVals = separateLineToVals2016Elections(separatedByLines[line]);
            ElectionData e = new ElectionData(lineVals);
            output.add(e);
            //System.out.println(e.toString());
        }
        return output;

    }

    private static ArrayList<String> separateLineToVals2016Elections(String line) {
        int indexOfFirstComma = line.indexOf(",");
        String currentLineModified = line.substring(indexOfFirstComma+1, line.length());
        ArrayList<String> lineVals = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            //while (currentLineModified.length() != 0){
            if (currentLineModified.substring(0, 1).equals("\"")) {
                int indexOfFirstQuotes = currentLineModified.indexOf("\"");
                int indexOfSecondQuotes = currentLineModified.indexOf("\"", indexOfFirstQuotes + 1);
                String val = removeCommas(currentLineModified.substring(indexOfFirstQuotes + 1, indexOfSecondQuotes));

                lineVals.add(val);
                currentLineModified = currentLineModified.substring(indexOfSecondQuotes + 2, currentLineModified.length());
            } else {
                int indexOfComma = currentLineModified.indexOf(",");
                if (indexOfComma < 0) {
                    indexOfComma = currentLineModified.length();
                }
                String val = currentLineModified.substring(0, indexOfComma);
                lineVals.add(removePercentSymbol(val));
                if (indexOfComma < currentLineModified.length()) {
                    currentLineModified = currentLineModified.substring(indexOfComma +1, currentLineModified.length());
                }
            }
        }
        return lineVals;
    }

    public static ArrayList<EducationData> parseResults2016Education(String data) {
        ArrayList<EducationData> output = new ArrayList<>();
        String[] separatedByLines = data.split("\n");
        // ArrayList<String> lineVals = new ArrayList<>();
        for (int line = 5; line < separatedByLines.length; line++) {
            ArrayList<String> lineVals = separateLineToVals2016Education(separatedByLines[line]);
            EducationData e = new EducationData(lineVals);
            output.add(e);
        }
        return output;

    }

    private static ArrayList<String> separateLineToVals2016Education(String line) {
        String currentLineModified = line;
        ArrayList<String> lineVals = new ArrayList<>();
        //while (currentLineModified.length() != 0) {
        for (int i = 0; i < 45; i++) {

            if (currentLineModified.substring(0, 1).equals("\"")) {
                int indexOfFirstQuotes = currentLineModified.indexOf("\"");
                int indexOfSecondQuotes = currentLineModified.indexOf("\"", indexOfFirstQuotes + 1);
                String val = removeCommas(currentLineModified.substring(indexOfFirstQuotes + 1, indexOfSecondQuotes));

                lineVals.add(val);
                currentLineModified = currentLineModified.substring(indexOfSecondQuotes + 2, currentLineModified.length());
            } else {
                int indexOfComma = currentLineModified.indexOf(",");
                if (indexOfComma < 0) {
                    indexOfComma = currentLineModified.length() - 1;
                }
                String val = currentLineModified.substring(0, indexOfComma +1);
                lineVals.add(removeCommas(removePercentSymbol(val)));
                if (indexOfComma < currentLineModified.length()) {
                    currentLineModified = currentLineModified.substring(indexOfComma + 1, currentLineModified.length());
                }
            }
        }
        return lineVals;
    }


    public static ArrayList<EmploymentData> parseResults2016Employment(String data) {
        ArrayList<EmploymentData> output = new ArrayList<>();
        String[] separatedByLines = data.split("\n");
        ArrayList<String> lineVals = new ArrayList<>();
        for (int line = 8; line < separatedByLines.length; line++) {
            lineVals = separateLineToVals2016Employment(separatedByLines[line]);
            EmploymentData e = new EmploymentData(lineVals);
            output.add(e);
        }
        return output;

    }

    private static ArrayList<String> separateLineToVals2016Employment(String line) {
        String currentLineModified = line;
        ArrayList<String> lineVals = new ArrayList<>();
        // while (currentLineModified.length() != 0) {
        for(int i = 0; i< 50; i++){
            if (currentLineModified.substring(0, 1).equals("\"")) {
                int indexOfFirstQuotes = currentLineModified.indexOf("\"");
                int indexOfSecondQuotes = currentLineModified.indexOf("\"", indexOfFirstQuotes + 1);
                String noSpace = removeSpaces(currentLineModified.substring(indexOfFirstQuotes+1, indexOfSecondQuotes).trim());
                String val;
                if (isANumber(noSpace)) {
                    //  System.out.println(noSpace + " is a number");
                    val = removeCommas(noSpace);
                    // System.out.println(val);
                } else {
                    //System.out.println(noSpace + " is NOT a number");
                    val = currentLineModified.substring(indexOfFirstQuotes+1, indexOfSecondQuotes);
                }
                lineVals.add(val);
                currentLineModified = currentLineModified.substring(indexOfSecondQuotes + 2, currentLineModified.length());
            } else {
                int indexOfComma = currentLineModified.indexOf(",");
                if (indexOfComma < 0) {
                    indexOfComma = currentLineModified.length();
                }
                String val = currentLineModified.substring(0, indexOfComma);
                String noSpaces = removePercentSymbol(removeSpaces(val));

                lineVals.add(removeCommas(removePercentSymbol(noSpaces)));
                if (indexOfComma < currentLineModified.length()) {
                    currentLineModified = currentLineModified.substring(indexOfComma + 1, currentLineModified.length());
                }
            }
        }
        return lineVals;
    }


    private static String removeSpaces(String line) {
        String output = "";
        for (int i = 0; i < line.length(); i++) {
            if (!line.substring(i, i+1).equals(" ")) {
                output += line.substring(i, i + 1);
            }
        }
        return output;
    }

    private static boolean isANumber(String str) {
        if (str.substring(0,1).equals("0") || str.substring(0,1).equals("1") || str.substring(0,1).equals("2") ||
                str.substring(0,1).equals("3") || str.substring(0,1).equals("4") || str.substring(0,1).equals("5")
                || str.substring(0,1).equals("6") || str.substring(0,1).equals("7") || str.substring(0,1).equals("8")
                || str.substring(0,1).equals("9")) {
            return true;
        }
        return false;
    }


    private static String removeCommas(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).equals(",")) {
                output += str.substring(i, i + 1);
            }
        }
        return output;
    }

    private static String removePercentSymbol(String string) {
        if (string.contains("%")) {
            return string.substring(0, string.indexOf("%"));
        }
        return string;
    }
}