package sibintek.drondemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import sibintek.drondemo.entity.UserData;

import java.util.List;

@RestController
@RequestMapping("/rest/userdata")
public class PythonIntegration {

    @Autowired
    SimpMessagingTemplate template;

    @PostMapping
    @CrossOrigin(origins = "*", methods = RequestMethod.POST)
    public void sendUserData(@RequestBody List<UserData> detectedPersons) {

        template.convertAndSend("/topic/message", detectedPersons);
    }
}
