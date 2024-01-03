# Lab 3

## Exercise A: Classes
Create the following classes in src/main, using the exact class names as provided. Remember that Java class names should always start with an uppercase letter.
* `CovidTest`
  - add the private field result of type `Result` (the enumeration Result is already created for you)
  - add `getters` and `setters` for the field `result`
* `TestSite`
  - add a list of `CovidTest` objects as a private field named `tests`
  - add a method `public void addTest(CovidTest t)` to add the test to the list (if the list is not initialized, this method must initialize it before adding the new test
 
```java
package main;

public class CovidTest {
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
```
```java
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
}
```
```java
package main;

public enum Result {
    inconclusive, positive, negative
}
```

## Exercise B: Inheritance and Polymorphism
In the same package, create two classes `CovidSwabTest` and `CovidAntiBodyTest` that are also `CovidTests` (use the `extends` keyword).

* Implement the constructor `public CovidSwabTest(String swabId)` that initializes attribute `private String swabId` in class `CovidSwabTest`.
* Implement the constructor `public CovidAntiBodyTest(String bloodSampleId)` that initializes attribute `private String bloodSampleId` in class `CovidAntiBodyTest`.

```java
package main;

public class CovidSwabTest extends CovidTest {
    private String swabId;

    public CovidSwabTest(String swabId) {
        this.swabId = swabId;
    }
}
```
```java
package main;

public class CovidAntiBodyTest extends CovidTest {
    private String bloodSampleId;

    public CovidAntiBodyTest(String bloodSampleId) {
        this.bloodSampleId = bloodSampleId;
    }
}
```

An API to evaluate tests is already provided by the method public static Result doTest(String sampleId) in class Laboratory.

**Disclaimer**: You may not use this Java application for any medical purposes!

Implement the method public void runTests() in class TestSite. This method should update the result of each test in list tests to the value returned by Laboratory.doTest(..).
* You will notice that this would require different handling of classes CovidSwabTest and CovidAntiBodyTest as they have different fields swabId and bloodSampleId.
* To avoid the above problem, add the abstract method public abstract String getSampleId() to CovidTest (you have to make the class abstract now) and implement the method in the corresponding subclasses to return swabId and bloodSampleId.

```java
package main;

public abstract class CovidTest {
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public abstract String getSampleId();
}
```
```java
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
}
```
```java
package main;

/**
 * The actual lab to do the tests based on IDs.
 */
public class Laboratory {

    /**
     * evaluate a covid test based on the sample ID
     *
     * @param sampleId ID of the sample to test for covid
     * @return either main.Result.positive or main.Result.negative
     */
    public static Result doTest(String sampleId) {
        return Result.values()[Math.abs(sampleId.hashCode()) % 3];
    }
}
```
```java
package main;

public class CovidSwabTest extends CovidTest {
    private String swabId;

    public CovidSwabTest(String swabId) {
        this.swabId = swabId;
    }

    @Override
    public String getSampleId() {
        return swabId;
    }
}
```
```java
package main;

public class CovidAntiBodyTest extends CovidTest {
    private String bloodSampleId;

    public CovidAntiBodyTest(String bloodSampleId) {
        this.bloodSampleId = bloodSampleId;
    }

    @Override
    public String getSampleId() {
        return bloodSampleId;
    }
}
```

## Exercise C: Interface Exportable
In the same package, create an interface `Exportable` with the method `public String export()`.

Implement the `interface Exportable` in the class `CovidTest`. For a covid test, the method should return the result of the test and the sample ID in CSV format, e.g., **negative, 231991**.

Implement the `interface Exportable` in the class `TestSite`. For a test site, the method should return the results of all tests in CSV format (use “\n” for a new line), e.g.,

```
negative, 231991
negative, 231992
negative, 231993
```

```java
package main;

public interface Exportable {
    public String export();
}
```
```java
package main;

public abstract class CovidTest implements Exportable {
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public abstract String getSampleId();

    @Override
    public String export() {
        if (result != null) {
            return result.toString() + ", " + getSampleId();
        } else {
            return "null, " + getSampleId();
        }
    }
}
```
```java
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
```
