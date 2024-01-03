package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import main.*;
import org.junit.jupiter.api.Test;

public class ExerciseCExportable {


    @Test
    void ExportableExists() throws ClassNotFoundException {
        assertNotNull(getClass().getClassLoader().loadClass("main.Exportable"));
    }

    @Test
    void ExportableExportExists() throws ClassNotFoundException, NoSuchMethodException, SecurityException {
        assertNotNull(getClass().getClassLoader().loadClass("main.Exportable").getDeclaredMethod("export"));
    }

    @Test
    void createExport1() {
        CovidTest t = new CovidSwabTest("2133532");
        assertEquals("null, 2133532", t.export());
    }


    @Test
    void createExport2() {
        CovidTest t = new CovidSwabTest("2133532");
        t.setResult(Result.inconclusive);
        assertEquals("inconclusive, 2133532", t.export());
    }

    @Test
    void testTestSiteEmptyExport() {
        TestSite ts = new TestSite();
        assertEquals("", ts.export());
    }

    @Test
    void testTestSiteExport1() {
        TestSite ts = new TestSite();
        ts.addTest(new CovidSwabTest("1"));
        assertEquals("null, 1\n", ts.export());
    }
    @Test
    void testTestSiteExport2() {
        TestSite ts = new TestSite();
        ts.addTest(new CovidSwabTest("1"));
        ts.addTest(new CovidAntiBodyTest("2"));
        assertEquals("null, 1\nnull, 2\n", ts.export());
    }


}
