package sibintek.drondemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class PythonIntegration {

    @GetMapping
    public String sendUsersToBroker() {
        return "works";
    }
}
