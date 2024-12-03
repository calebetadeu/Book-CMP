package com.plcoding.bookpedia.core.presentation

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun PulseAnimation(modifier: Modifier = Modifier) {

    val transation = rememberInfiniteTransition()
    val progress by transation.animateFloat(
        initialValue = 0.5f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000),
            repeatMode = RepeatMode.Reverse

        )
    )
    Box(
        modifier = modifier
            .graphicsLayer(
                scaleX = progress,
                scaleY = progress
            )
            .border(
                width = 5.dp,
                color = SandYellow,
                shape = CircleShape
            )
    )

}