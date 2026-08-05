package DataEncapsulation;


public class Access {

    private String name = "JOHN";

    private int hisAge = 45;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHisAge() {
        return hisAge;
    }

    public void setHisAge(int hisAge) {
        this.hisAge = hisAge;
    }

    //Setter Getter

    /*public int getHisAge(){
        return this.hisAge;
    }

    public void setHisAge(int hisAge){
        this.hisAge = hisAge;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }*/



}
