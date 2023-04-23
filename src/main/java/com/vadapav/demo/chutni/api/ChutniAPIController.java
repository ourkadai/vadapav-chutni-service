package com.vadapav.demo.chutni.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChutniAPIController {
    @GetMapping("/api/chutni")
    String all() {
        return "Red";
    }
}
