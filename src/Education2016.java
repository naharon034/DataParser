import java.util.ArrayList;

public class Education2016 {
    private double noHighSchool;
    private double onlyHighSchool;
    private double someCollege;
    private double bachlorsOrMore;

    public Education2016(ArrayList<String> arr) {
        this.noHighSchool = Integer.parseInt(arr.get(37));
        this.onlyHighSchool = Integer.parseInt(arr.get(38));
        this.someCollege = Integer.parseInt(arr.get(39));
        this.bachlorsOrMore = Integer.parseInt(arr.get(40));
    }

    @Override
    public String toString() {
        return "Education2016{" +
                "noHighSchool=" + noHighSchool +
                ", onlyHighSchool=" + onlyHighSchool +
                ", someCollege=" + someCollege +
                ", bachlorsOrMore=" + bachlorsOrMore +
                '}';
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public void setNoHighSchool(double noHighSchool) {
        this.noHighSchool = noHighSchool;
    }

    public double getOnlyHighSchool() {
        return onlyHighSchool;
    }

    public void setOnlyHighSchool(double onlyHighSchool) {
        this.onlyHighSchool = onlyHighSchool;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachlorsOrMore() {
        return bachlorsOrMore;
    }

    public void setBachlorsOrMore(double bachlorsOrMore) {
        this.bachlorsOrMore = bachlorsOrMore;
    }


}