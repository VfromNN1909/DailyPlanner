package me.vlasoff.dailyplanner.presentation.ui.calendar.widgets

import android.os.Build
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import java.time.DayOfWeek
import kotlin.math.ceil


@Composable
fun CalendarGrid(
    currentYear: Int,
    currentMonth: Int,
    daysCountInCurrentMonth: Int,
    todayYear: Int,
    todayMonth: Int,
    todayDay: Int,
    selectedYear: Int,
    selectedMonth: Int,
    selectedDay: Int,
    dayStartOfMonth: DayOfWeek,
    onDatePick: (Int, Int, Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        val rowsCount = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ceil((daysCountInCurrentMonth + dayStartOfMonth.value) / 7.0).toInt()
        } else {
            TODO("VERSION.SDK_INT < O")
        }
    }
}