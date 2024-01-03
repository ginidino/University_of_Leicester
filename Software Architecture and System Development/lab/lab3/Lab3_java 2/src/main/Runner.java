package main;

public class Runner {
    public static void main(String[] args) {
        TestSite s1 = new TestSite();
        s1.addTest(new CovidAntiBodyTest("023189"));
        s1.addTest(new CovidSwabTest("adsasd"));

        System.out.println(s1.export());

        s1.runTests();

        System.out.println(s1.export());
    }
}
