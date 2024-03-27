package vsg.veera.contentcalendar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
@RequestMapping("/configTest")
public class ContentController1 {

    @Value("${cc.Message}")
    private String Message;

    @Value("${cc.about}")
    private String about;

    @GetMapping("")
    public Map<String,String> home(){
        return Map.of("Message",Message, "About",about);
    }
 }
