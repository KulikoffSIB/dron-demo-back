package sibintek.drondemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import sibintek.drondemo.entity.UserDatasAndHelmetEvent;

@RestController
@RequestMapping("/rest/userdata")
public class PythonIntegration {

    @Autowired
    SimpMessagingTemplate template;

    @PostMapping
    @CrossOrigin(origins = "*", methods = RequestMethod.POST)
    public void sendUserData(@RequestBody UserDatasAndHelmetEvent detectedPersons) {

        template.convertAndSend("/topic/message", detectedPersons);
    }
}
