package me.vlasoff.dailyplanner.presentation.ui.calendar.model

import androidx.compose.ui.graphics.Color
import java.time.format.TextStyle

data class CalendarDate(
    val dateInMilliseconds: Long,
    val background: Color = Color.Unspecified,
    val textStyle: TextStyle? = null
)