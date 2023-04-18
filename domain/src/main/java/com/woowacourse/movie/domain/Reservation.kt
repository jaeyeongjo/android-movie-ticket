package com.woowacourse.movie.domain

import java.time.LocalDateTime

data class Reservation(
    val movie: Movie,
    val dateTime: LocalDateTime,
    val ticket: Ticket,
    val totalPrice: Int
)