import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    private Number number1;

    @Before
    public void before(){
        this.number1=new Number(2,3);
    }
    @Test
    public void add() {
        assertEquals(5,this.number1.Add());
    }
}