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
