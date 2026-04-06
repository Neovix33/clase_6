package com.bfernandez.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
data class SecondPage(val name: String)

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen(navController = navController)
        }
        composable<SecondPage> { backstackEntry -> val args = backstackEntry.toRoute<SecondPage>()
            SecondPageScreen(navController = navController, name = args.name)
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {

}

@Composable
fun SecondPageScreen(navController: NavHostController, name: String) {

}