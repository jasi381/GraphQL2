package com.example.graphql2.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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
        LazyColumn(Modifier.fillMaxSize()){
          items(state.moduleId?.toList() ?: listOf("error") ){
                Text(text =it.toString(), color = Color.Black)
          }
        }
    }

}