import java.util.ArrayList;

public class ElectionResults {
    //,votes_dem,votes_gop,total_votes,per_dem,per_gop,diff,per_point_diff,state_abbr,county_name,combined_fips
    //0,93003.0,130413.0,246588.0,0.37715947248,0.528870018006,"37,410",15.17%,AK,Alaska,2013

    double demVotes, gopVotes, totalVotes, perDem, perGop, perPointDiff;
    int rowNum, diff, areaCode;
    String stateAbbr, countryName;

    public ElectionResults(ArrayList<String> line){
     rowNum = Integer.parseInt(line.get(0));
     demVotes = Double.parseDouble(line.get(1));
     gopVotes = Double.parseDouble(line.get(2));
     totalVotes = Double.parseDouble(line.get(3));
     perDem = Double.parseDouble(line.get(4));
     perGop = Double.parseDouble(line.get(5));
     diff = Integer.parseInt(line.get(6));
     perPointDiff = Double.parseDouble(line.get(7));
     stateAbbr = line.get(8);
     countryName = line.get(9);
     areaCode = Integer.parseInt(line.get(10));

    }
}
