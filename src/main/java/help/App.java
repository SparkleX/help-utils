package help;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App 
{
    public static void main(String []args) 
    {
    	SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/test")
    public String  test(@RequestParam("test") String test)
    {
    	return "hello";
    }
}
