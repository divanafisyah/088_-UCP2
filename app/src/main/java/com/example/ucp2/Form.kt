package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import java.text.Normalizer.Form

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form(
        onSubmitButtonCliked: (MutableList<String>) -> Unit
){
    var namaTxt bt remember{
        mutableStateOf("")
    }
    var nimTxt bt remember{
        mutableStateOf("")
    }
    var konsTxt bt remember{
        mutableStateOf("")
    }
    var judulTxt bt remember{
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf (namaTxt, nimTxt, konsTxt, judulTxt)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        OutlinedTextField(
            value = namaTxt,
            onValueChange = {namaTxt = it},
            label = { Text(text = stringResource(id = "Nama"))}
        )
    }
}