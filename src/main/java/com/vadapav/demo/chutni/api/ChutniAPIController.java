package com.vadapav.demo.chutni.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChutniAPIController {

    enum Chutni {
        CHILLI,
        MINT
    }
      

    @GetMapping("/api/chutni")
    Chutni all() {
        return Chutni.CHILLI;
    }
}
