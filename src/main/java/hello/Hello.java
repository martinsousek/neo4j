package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by t945083 on 28.3.2015.
 */
@RestController
public class Hello {

    @RequestMapping("/")
    public String index(){
        return "Hello from spring boot";
    }
}
