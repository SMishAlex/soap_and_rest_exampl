package example.path;


public final class ApiEndpoint {

    public static final String CALCULATE = "/api/v1/calculate";
    public static final String SUM = CALCULATE + "/sum";
    public static final String MULTIPLY = CALCULATE + "{a}/multiply/{b}";
    public static final String POW = CALCULATE + "/pow";
}
