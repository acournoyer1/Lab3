package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuddyController {
    @Autowired
    private BuddyInfoRepository repository;

    @RequestMapping("/buddies/{name}")
    public List<BuddyInfo> buddy(@PathVariable String name) {
        return repository.findByName(name);
    }

    @PostMapping("/buddies")
    public BuddyInfo addBuddy(@RequestBody BuddyInfo newBuddy) {
        return repository.save(newBuddy);
    }


}
