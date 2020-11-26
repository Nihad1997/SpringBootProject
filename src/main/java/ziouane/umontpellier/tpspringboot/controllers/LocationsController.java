package ziouane.umontpellier.tpspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ziouane.umontpellier.tpspringboot.repositories.UserRepository;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationsController {
    @Autowired
    private UserRepository userRepository;
}
