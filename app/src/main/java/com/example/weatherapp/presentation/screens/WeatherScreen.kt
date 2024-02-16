package com.example.weatherapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoadedWeatherScreen(
    modifier: Modifier = Modifier,
    loadedUiState: MainScreenUiState
) {

    Box (
        modifier = modifier.fillMaxSize(),
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
        ) {
            Text(text = "",
                fontSize = 12.dp

            )

        }

    }



}