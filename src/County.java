public class County {
    private String name;
    private int flips;
   // private Election2016 vote2016;

    public County(String name, int flips, Education2016 educ2016, Employment2016 employ2016) {
        this.name = name;
        this.flips = flips;
        //this.vote2016 = vote2016;
        this.educ2016 = educ2016;
        this.employ2016 = employ2016;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlips() {
        return flips;
    }

    public void setFlips(int flips) {
        this.flips = flips;
    }

//    public Election2016 getVote2016() {
//        return vote2016;
//    }
//
//    public void setVote2016(Election2016 vote2016) {
//        this.vote2016 = vote2016;
//    }

    public Education2016 getEduc2016() {
        return educ2016;
    }

    public void setEduc2016(Education2016 educ2016) {
        this.educ2016 = educ2016;
    }

    public Employment2016 getEmploy2016() {
        return employ2016;
    }

    public void setEmploy2016(Employment2016 employ2016) {
        this.employ2016 = employ2016;
    }

    private Education2016 educ2016;
    private Employment2016 employ2016;
}