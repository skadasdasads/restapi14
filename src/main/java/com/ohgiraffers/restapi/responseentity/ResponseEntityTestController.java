package com.ohgiraffers.restapi.responseentity;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/entity")

public class ResponseEntityTestController {


    private List<UserDTO> users;

    public ResponseEntityTestController() {

        users = new ArrayList<>();

        users.add(new UserDTO(1, "user01", "pass03", "너구리", LocalDate.now()));
        users.add(new UserDTO(2, "user02", "pass03", "코알라", LocalDate.now()));
        users.add(new UserDTO(3, "user03", "pass03", "곰", LocalDate.now()));
    }
    
    @GetMapping("/users")
    public ResponseEntity<ResponseMessage> findAllUsers() {


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(
                new MediaType(
                        "appliation",
                        "json",
                        Charset.defaultCharset().forName("UTF-8")
                )
        );
        )