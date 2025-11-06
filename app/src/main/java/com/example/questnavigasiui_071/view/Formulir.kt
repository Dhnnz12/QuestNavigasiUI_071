@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.questnavigasiui_071.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.questnavigasiui_071.R

@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier =Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (colorResource(R.color.teal_700))

            )
        }
        ){ isiRuang ->
        Column (modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,)
    }
}


