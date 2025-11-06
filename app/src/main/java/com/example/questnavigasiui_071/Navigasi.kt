package com.example.questnavigasiui_071

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

enum class Navigasi {

    Formulirku,

    Detail
}

@Composable
fun DataApp(
    navController: NavController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)) {
            composable(route = Navigasi.Formulirku.name) {
                FormIsian(
                    OnsubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
        }
    }

}