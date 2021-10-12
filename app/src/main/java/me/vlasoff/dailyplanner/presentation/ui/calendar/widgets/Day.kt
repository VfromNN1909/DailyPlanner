package me.vlasoff.dailyplanner.presentation.ui.calendar.widgets

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Day(
    modifier: Modifier = Modifier,
    day: Int,
    isSelected: Boolean,
    isToday: Boolean,
    isHoliday: Boolean,
    onDayClick: (Int) -> Unit
) {
    Surface(
        color = if (isSelected) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
        shape = if (isSelected) MaterialTheme.shapes.medium else RectangleShape
    ) {
        var dayModifier = modifier
            .clickable { onDayClick(day) }

        if (isToday) {
            dayModifier = dayModifier.border(
                width = 1.dp,
                color = Color.Blue,
                shape = MaterialTheme.shapes.medium
            )
        }

        Box(
            modifier = dayModifier,
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "$day",
                maxLines = 1,
                textAlign = TextAlign.Center,
                color = if (isHoliday) Color.Red else Color.Unspecified

            )
        }
    }
}

@Composable
fun EmptyDay(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = "",
        maxLines = 1,
        textAlign = TextAlign.Center
    )
}

@Preview
@Composable
fun DayPreview() {
    EmptyDay()
}