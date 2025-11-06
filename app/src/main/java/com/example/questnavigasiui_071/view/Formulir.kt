@file:OptIn(ExprimentalMaterial3Api::class)

package com.example.questnavigasiui_071.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource


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
            )}
        }
        )
}


