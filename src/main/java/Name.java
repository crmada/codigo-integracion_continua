import java.util.Locale;

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

    public String returnName(){
        String d1="";
        for (int i = b1.length()-1;i>=0;i--){

            d1=d1+b1.charAt(i);
        }

        return d1;
    }

    public String writeMayus(){
        return this.b1.toUpperCase();
    }

}
