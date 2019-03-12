import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Noa Aharon
 */
public class Main {
    public static void main(String[] args) {
        //test of utils

        //String data = Utils.readFileAsString("data/Education.csv");
        //System.out.println(data);

        String data = Utils.readFileAsString("data/Education.csv");
        //System.out.println(data);
        ArrayList<EducationData> results = Utils.parseResults2016Education(data);
        System.out.println(results.toString());

    }
}
