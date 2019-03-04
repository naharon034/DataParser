import java.util.ArrayList;

public class ElectionResults {
    //,votes_dem,votes_gop,total_votes,per_dem,per_gop,diff,per_point_diff,state_abbr,county_name,combined_fips
    //0,93003.0,130413.0,246588.0,0.37715947248,0.528870018006,"37,410",15.17%,AK,Alaska,2013

    double demVotes, gopVotes, totalVotes, perDem, perGop, perPointDiff;
    int diff, areaCode;
    String stateAbbr, countryName;

    public ElectionResults(ArrayList<String> line){
//        System.out.println(line.get(0));
//        System.out.println(line.get(1));
//        System.out.println(line.get(2));
//        System.out.println(line.get(3));
//        System.out.println(line.get(4));

        demVotes = Double.parseDouble(line.get(0));
        gopVotes = Double.parseDouble(line.get(1));
        totalVotes = Double.parseDouble(line.get(2));
        perDem = Double.parseDouble(line.get(3));
        perGop = Double.parseDouble(line.get(4));
        diff = Integer.parseInt(line.get(5));
        perPointDiff = Double.parseDouble(line.get(6));
        stateAbbr = line.get(7);
        countryName = line.get(8);
        areaCode = Integer.parseInt(line.get(9));
    }
    public String toString() {
        return "ElectionResults{" +
                "demVotes=" + demVotes +
                ", gopVotes=" + gopVotes +
                ", totalVotes=" + totalVotes +
                ", perDem=" + perDem +
                ", perGop=" + perGop +
                ", perPointDiff=" + perPointDiff +
                ", diff=" + diff +
                ", areaCode=" + areaCode +
                ", stateAbbr='" + stateAbbr + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public double getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    public double getPerDem() {
        return perDem;
    }

    public void setPerDem(double perDem) {
        this.perDem = perDem;
    }

    public double getPerGop() {
        return perGop;
    }

    public void setPerGop(double perGop) {
        this.perGop = perGop;
    }

    public double getPerPointDiff() {
        return perPointDiff;
    }

    public void setPerPointDiff(double perPointDiff) {
        this.perPointDiff = perPointDiff;
    }



    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
