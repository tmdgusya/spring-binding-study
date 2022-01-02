package com.roach.studyspringbinding.controller

import com.roach.studyspringbinding.dto.User
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

  @PostMapping("/test")
  fun test(@RequestBody user: User): String {
    log.info(user.toString());

    return "Hello"
  }

  companion object {
    val log = LoggerFactory.getLogger(TestController::class.java)
  }

}