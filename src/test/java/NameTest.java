import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {


    private Name b1;

    @Before
    public void before(){
        this.b1=new Name("marco");
    }
    @Test
    public void countCaracters() {
        assertEquals(5, this.b1.countCaracters());
    }
}