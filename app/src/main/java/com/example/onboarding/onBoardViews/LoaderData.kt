package com.example.onboarding.onBoardViews

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LoaderData(modifier: Modifier, image: Int) {
    // variable para almacenar la animacion
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(image))

    //componente para mostrar la animacion
    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        modifier = modifier
    )
}