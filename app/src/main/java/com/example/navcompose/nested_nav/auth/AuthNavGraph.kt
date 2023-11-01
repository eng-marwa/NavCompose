package com.example.navcompose.nested_nav.auth

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navcompose.NavigationItem


fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(
        startDestination = NavigationItem.Login.route,
        route = NavigationItem.AuthRoute.route
    ) {
        composable(NavigationItem.Login.route) { LoginScreen(navController) }
        composable(NavigationItem.Register.route) { RegisterScreen(navController) }
        composable(NavigationItem.ForgetPassword.route) { ForgetPasswordScreen(navController) }
    }
}