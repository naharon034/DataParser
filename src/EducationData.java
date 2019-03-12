import java.util.ArrayList;

public class EducationData {
    private double noHighSchool;
    private double onlyHighSchool;
    private double someCollege;
    private double bachlorsOrMore;

    public EducationData(ArrayList<String> arr) {
       if (isntEmpty(arr.get(37))){ this.noHighSchool = (Double.parseDouble(arr.get(37)));}
        if (isntEmpty(arr.get(38))){ this.onlyHighSchool = (int)(Double.parseDouble(arr.get(38)));}
        if (isntEmpty(arr.get(39))){ this.someCollege = (int)(Double.parseDouble(arr.get(39)));}
        if (isntEmpty(arr.get(40))){ this.bachlorsOrMore = (int)(Double.parseDouble(arr.get(40)));}
    }
    private boolean isntEmpty(String str){
        if( str.equals("")|| str.equals(null)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EducationData{" +
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
