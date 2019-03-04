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
    public static ArrayList<ElectionResults> parse2016ElectionResults( String data) {
        ArrayList <ElectionResults> output = new ArrayList();
        String[] results = data.split("\n");

        for (int line = 1; line < results.length; line++) {
            ArrayList lineList = new ArrayList();
            String currentLine = results[line];
            int firstCommaIndex = currentLine.indexOf(",");
            String currentLineModified = currentLine.substring(firstCommaIndex + 1, currentLine.length());

            for (int i = 0; i < 10; i++) {
                if (currentLineModified.substring(0, 1).equals('"') && currentLineModified.contains(",")) {
                    int indexOfFirstQuotes = currentLineModified.indexOf('"');
                    int indexOfSecondQuotes = currentLineModified.indexOf('"', indexOfFirstQuotes + 1);
                    String val = removeCommas(currentLineModified.substring(indexOfFirstQuotes + 1, indexOfSecondQuotes));

                    lineList.add(currentLineModified.substring(indexOfFirstQuotes + 1, indexOfSecondQuotes));
                    currentLineModified = currentLineModified.substring(indexOfSecondQuotes + 2, currentLineModified.length());
                } else if (currentLineModified.substring(0, 1).equals('"')) {
                    int indexOfFirstQuotes = currentLineModified.indexOf('"');
                    int indexOfSecondQuotes = currentLineModified.indexOf('"', indexOfFirstQuotes + 1);

                    lineList.add(currentLineModified.substring(indexOfFirstQuotes + 1, indexOfSecondQuotes));
                    currentLineModified = currentLineModified.substring(indexOfSecondQuotes + 2, currentLineModified.length());
                } else {
                    int indexOfComma = currentLineModified.indexOf(",");
                    if(indexOfComma < 0 ){ indexOfComma = currentLineModified.length();}
                    String val = currentLineModified.substring(0, indexOfComma);
                    lineList.add(removePercentSymbol(val));
                    if(indexOfComma < currentLineModified.length()) {
                        currentLineModified = currentLineModified.substring(indexOfComma + 1, currentLineModified.length());
                    }
                }
            }

            ElectionResults electionResults = new ElectionResults(lineList);
            output.add(electionResults);
        }
        return output;

    }
    private static String removeCommas(String str){
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if(!str.substring(i, i+1).equals(",")){
                output +=str.substring(i, i+1);
            }
        }
        return output;
    }
    private static String removePercentSymbol(String string){
        if(string.contains("%")) {
            return string.substring(0, string.indexOf("%"));
        }
        return string;
    }



}


}
