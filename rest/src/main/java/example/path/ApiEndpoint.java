package example.path;


public final class ApiEndpoint {

    public static final String CULCULATE = "/api/v1/calculate";
    public static final String SUM = CULCULATE + "/sum";
    public static final String MULTIPLY = CULCULATE + "{a}/multiply/{b}";
    public static final String POW = CULCULATE + "/pow";
}
