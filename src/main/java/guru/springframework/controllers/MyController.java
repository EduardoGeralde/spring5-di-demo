package guru.springframework.controllers;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");

        return "foo";
    }
}
