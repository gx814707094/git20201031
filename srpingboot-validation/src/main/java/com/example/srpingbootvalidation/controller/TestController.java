package com.example.srpingbootvalidation.controller;

import com.example.srpingbootvalidation.annoation.ValidList;
import com.example.srpingbootvalidation.bean.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.HashDocAttributeSet;
import javax.validation.Valid;
import java.util.List;

/**
 * @Classname TestController
 * @Description
 * @Date 2020/10/17 16:00
 * @Created gengxiao
 */
@RestController
@Validated
public class TestController {
    @PostMapping("/add/testgxdsb")
    public String testgxdsb(){
        return "testgxdsb";
    }

    @PostMapping("/add/person")
    public String addPerson(@RequestBody @Valid Person person){
        return "ok";
    }

    @PostMapping("/batch/add/person")
    public String batchAddPerson(@RequestBody @ValidList List<Person> personList){
        return "感谢啊实打实大苏打";
    }





}
