package com.example.calendar.model

import org.springframework.web.bind.annotation.RequestMethod

class Endpoint(
    val method: RequestMethod,
    val path: String,
) {
}