package com.in28minutes.rest.webservices.restfulwebservices.resources;

import com.in28minutes.rest.webservices.restfulwebservices.model.Welcome;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(
        value = {"/api/hello"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@Validated
public class Hello {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public Welcome greetings(@RequestParam("name") String name, Principal principal) {
        return new Welcome(name + " (" + principal.getName() + ")");
    }
}
