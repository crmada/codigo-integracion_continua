public class Name {
    private String b1;

    public Name(String b1) {
        this.b1 = b1;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public int countCaracters(){
        return this.b1.length();
    }


}
