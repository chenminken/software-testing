import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

// PrivateMethodClassTest.java
public class PrivateMethodClassTest {
    @Test
    public void testPrivatePlus1() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cls = Class.forName("PrivateMethodClass");
        Method msd = cls.getDeclaredMethod("privatePlus", int.class, int.class);
        msd.setAccessible(true);
        Object obj = cls.newInstance();
        int res = (Integer)msd.invoke(obj, 4,6);
        assertEquals(10, res);
    }
}