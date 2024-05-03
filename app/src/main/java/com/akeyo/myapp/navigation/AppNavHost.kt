package com.akeyo.myapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.akeyo.myapp.ui.theme.screens.about.Abtscreen
import com.akeyo.myapp.ui.theme.screens.home.Hmscreen
import com.akeyo.myapp.ui.theme.screens.register.Rgstscreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController (),
               startDestination: String = ROUTE_HOME) {
    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Hmscreen(navController)
        }
        composable(ROUTE_ABOUT){
            Abtscreen(navController)
        }
        composable(ROUTE_REGISTER){
            Rgstscreen(navController)
        }

    }
}