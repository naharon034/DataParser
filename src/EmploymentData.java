
import java.util.ArrayList;

public class EmploymentData {
    private int totalLaborForce;
    private int employedLaborForce;
    private int unemployedLaborForce;
    private double unemployedPercent;

    public EmploymentData(ArrayList<String> arr) {
        if(isntEmpty(arr.get(41))){ this.totalLaborForce = (int)Double.parseDouble(arr.get(41));}
        if(isntEmpty(arr.get(42))){this.employedLaborForce = (int)Double.parseDouble(arr.get(42));}
        if(isntEmpty(arr.get(43))){this.unemployedLaborForce = (int)Double.parseDouble(arr.get(43));}
        if(isntEmpty(arr.get(44))){this.unemployedPercent = Double.parseDouble(arr.get(44));}
    }
    private boolean isntEmpty(String str){
        if( str.equals("")|| str.equals(null)){
            return false;
        }
        return true;
    }

    public int getTotalLaborForce() {
        return totalLaborForce;
    }

    public void setTotalLaborForce(int totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    @Override
    public String toString() {
        return "EmploymentData{" +
                "totalLaborForce=" + totalLaborForce +
                ", employedLaborForce=" + employedLaborForce +
                ", unemployedLaborForce=" + unemployedLaborForce +
                ", unemployedPercent=" + unemployedPercent + "\n" +
                '}';
    }

    public int getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(int employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public int getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(int unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }

}
