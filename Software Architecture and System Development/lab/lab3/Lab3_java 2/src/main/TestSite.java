package main;

import java.util.ArrayList;
import java.util.List;

public class TestSite implements Exportable {
    private List<CovidTest> tests;

    public void addTest(CovidTest t) {
        if (tests == null) {
            tests = new ArrayList<>();
        }
        tests.add(t);
    }

    public void runTests() {
        if (tests != null) {
            for (CovidTest ctest : tests) {
                ctest.setResult(Laboratory.doTest(ctest.getSampleId()));
            }
        }
    }

//    @Override
//    public String export() {
//        StringBuilder csvBuilder = new StringBuilder();
//        if (tests != null) {
//            for (CovidTest ctest : tests) {
//                String resultString;
//                if (ctest.getResult() == null) {
//                    resultString = "null";
//                } else {
//                    resultString = ctest.getResult().toString();
//                }
//                csvBuilder.append(resultString).append(", ").append(ctest.getSampleId()).append("\n");
//            }
//        }
//        return csvBuilder.toString();
//    }

    @Override
    public String export() {
        String res = "";
        if (tests == null) {
            return res;
        }
        for (CovidTest t : tests) {
            res += t.export();
            res += "\n";
        }
        return res;
    }
}
