import java.util.ArrayList;

public class ElectionData {
    private int demVotes, gopVotes, totalVotes, year;
    private String countyName;
    private String stateName;
    private int fips;

    public ElectionData(ArrayList<String> arr) {
        demVotes = (int)Double.parseDouble(arr.get(0));
        gopVotes = (int)Double.parseDouble(arr.get(1));
        totalVotes = (int) Double.parseDouble(arr.get(2));
        this.year = 2016;
        this.countyName = arr.get(8);
        this.stateName = arr.get(7);
        this.fips = Integer.parseInt(arr.get(10));
    }

    @Override
    public String toString() {
        return "ElectionData{" +
                "demVotes=" + demVotes +
                ", gopVotes=" + gopVotes +
                ", totalVotes=" + totalVotes +
                ", year=" + year +
                ", countyName='" + countyName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", fips=" + fips + "\n" +
                '}';
    }

    public int getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(int demVotes) {
        this.demVotes = demVotes;
    }

    public int getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(int gopVotes) {
        this.gopVotes = gopVotes;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }
}