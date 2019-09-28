package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    HashMap<String, ArrayList<User>> cars = new HashMap();

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return  service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("id-"+id);
        return service.findOne(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        User user = service.deleteById(id);
        if(user==null)
            throw new UserNotFoundException("id-"+id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/get-users/{id}")
    public List<Employees> findAll(@PathVariable String id) {

        List<Employees> result = jdbcTemplate.query(
                "SELECT FIRST_NAME , LAST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID="+id,
                (rs, rowNum) -> new Employees(rs.getString("FIRST_NAME"), rs.getString("LAST_NAME"))
        );

        if(result.isEmpty())
            throw new UserNotFoundException("id-"+id);

        return result;

    }

}
