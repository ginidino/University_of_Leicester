package test;

import main.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ExerciseAClasses {

    @Test
    void CovidTestExists() throws ClassNotFoundException {
        assertNotNull(getClass().getClassLoader().loadClass("main.CovidTest"));
    }

    @Test
    void CovidTestFieldResultExists() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
        Class<?> c = getClass().getClassLoader().loadClass("main.CovidTest");
        assertNotNull(c.getDeclaredField("result"));
    }

    @Test
    void CovidTestFieldResultCorrectType() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
        Class<?> c = getClass().getClassLoader().loadClass("main.CovidTest");
        assertEquals(c.getDeclaredField("result").getType(), Result.class);
    }

    @Test
    void TestSiteExists() throws ClassNotFoundException {
        assertNotNull(getClass().getClassLoader().loadClass("main.TestSite"));
    }

    @Test
    void TestSiteFieldTestsExists() throws ClassNotFoundException, NoSuchFieldException, SecurityException {
        Class<?> c = getClass().getClassLoader().loadClass("main.TestSite");
        assertNotNull(c.getDeclaredField("tests"));
    }

    @Test
    void TestSiteAddTestExists() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
        Class<?> ct = getClass().getClassLoader().loadClass("main.CovidTest");
        Class<?> ts = getClass().getClassLoader().loadClass("main.TestSite");
        assertNotNull(ts.getDeclaredMethod("addTest", ct));
    }
}
