package test;

import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author james.affleck
 */
public class UtilsTest {

    @Test
    public void testa() {
        System.out.println("starting testa" );
        boolean hasSameProduct = false;
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertTrue(hasSameProduct, "TestA Should be True");
        System.out.println("finished testa" );
    }

    @Test
    public void testb() {
        System.out.println("starting testb" );
        boolean hasSameProduct = true;
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertFalse(hasSameProduct, "TestB Should be False");
        System.out.println("finished testb" );
    }

    @Test
    public void testc() {
        Boolean hasSameProduct = true;
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertNotNull(hasSameProduct, "Testc Should be null");
        System.out.println("finished testc" );
    }
}
