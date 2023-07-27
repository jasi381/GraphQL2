package com.example.graphql2.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun UiScreen(
    state:ModulesViewModel.ModulesState
) {
   if (state.isLoading){
         Box(modifier = Modifier.fillMaxSize()){
             LinearProgressIndicator(
                 modifier = Modifier.align(Alignment.Center)
             )
         }
   }
    else{
        Box (Modifier.fillMaxSize()){
            Text(text = state.moduleId ?: "error", color = Color.Black, fontSize = 90.sp, modifier = Modifier.align(Alignment.Center))

        }

    }

}