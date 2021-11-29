package com.github.maxfie1d.columnrow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

@Composable
fun LayoutDirectionExample() {
    Column {
        ProvideLayoutDirection(layoutDirection = LayoutDirection.Ltr) {
            Seasons()
        }

        ProvideLayoutDirection(layoutDirection = LayoutDirection.Rtl) {
            Seasons()
        }
    }
}

@Composable
private fun ProvideLayoutDirection(
    layoutDirection: LayoutDirection,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalLayoutDirection provides layoutDirection,
        content = content,
    )
}

@Composable
private fun Seasons() {
    Row(
        modifier = Modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(text = "春")
        Text(text = "夏")
        Text(text = "秋")
        Text(text = "冬")
    }
}
