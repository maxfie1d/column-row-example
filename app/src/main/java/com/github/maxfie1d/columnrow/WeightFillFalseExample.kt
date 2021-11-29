package com.github.maxfie1d.columnrow

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun WeightFillFalseExample() {
    Column {
        UserItem("なおと", 26)
        UserItem("なおと@Qiita Advent Calendar 2021参加中", 26)
    }
}

@Composable
private fun UserItem(
    name: String,
    age: Int,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = name,
            modifier = Modifier.weight(weight = 1f, fill = false),
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "${age}歳",
            style = MaterialTheme.typography.bodySmall,
        )
    }
}
