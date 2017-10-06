package example.controller;

import example.entity.ArgsToPow;
import example.path.ApiEndpoint;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculateController {

    @RequestMapping(path = ApiEndpoint.SUM, method = RequestMethod.GET)
    public Integer sum(@RequestParam(value = "a", required = false) Integer a, @RequestParam(value = "b", required = false) Integer b) {
        return (a == null ? 0 : a)
                + (b == null ? 0 : b);
    }

    @RequestMapping(path = ApiEndpoint.MULTIPLY, method = RequestMethod.GET)
    public Integer multiply(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a * b;
    }

    @RequestMapping(path = ApiEndpoint.POW, method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Double pow(@RequestBody ArgsToPow args) {
        return Math.pow(args.getA(), args.getB());
    }
}
