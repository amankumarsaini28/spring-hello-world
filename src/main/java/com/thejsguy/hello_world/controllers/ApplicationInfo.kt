package com.thejsguy.hello_world.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ApplicationInfo {

    @GetMapping("/isActive")
    public fun getIsActive(): String = "ACTIVE";

    @GetMapping("/version")
    public fun getVersion(): String = "1.0.0";
}