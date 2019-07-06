/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercises.backendexercise1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FRANCK
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "juste pur voir";
    }
}
