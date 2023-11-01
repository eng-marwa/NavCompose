package com.example.navcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navcompose.arguments.DetailsScreen
import com.example.navcompose.arguments.FormScreen
import com.example.navcompose.basic.HomeScreen
import com.example.navcompose.nested_nav.main.ProductDetailsScreen
import com.example.navcompose.nested_nav.main.ProductScreen
import com.example.navcompose.basic.ProfileScreen
import com.example.navcompose.basic.SplashScreen
import com.example.navcompose.custome_arguments.User
import com.example.navcompose.custome_arguments.UserLoginScreen
import com.example.navcompose.nested_nav.auth.authNavGraph
import com.example.navcompose.nested_nav.main.appNavGraph


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.AuthRoute.route
) {
    NavHost(navController = navController, startDestination = startDestination) {
        //note composable with small letter it's a compose navigation
        composable(NavigationItem.Splash.route) { SplashScreen(navController = navController) }
        composable(NavigationItem.Home.route) { HomeScreen(navController) }
        composable(NavigationItem.Profile.route) { ProfileScreen(navController) }

        composable(
            NavigationItem.Forms.route
        ) {
            FormScreen(
                navController = navController,
            )
        }
        composable(
//            NavigationItem.Details.route + "/{name}",
//            arguments = listOf(navArgument(name = "name") {
//                this.type = NavType.StringType
//            }
            "${NavigationItem.Details.route}?name={name}",
            arguments = listOf(navArgument(name = "name") {
                this.type = NavType.StringType
                this.defaultValue = "Guest"
            }
            )
        ) { backStackEntry ->
            DetailsScreen(
                navController = navController, name = backStackEntry.arguments?.getString("name")
            )
        }

        authNavGraph(navController)
        appNavGraph(navController)


        composable(
            NavigationItem.UserLogin.route
        ) {
            UserLoginScreen(
                navController = navController,
            )
        }
        composable(
            "${NavigationItem.Main.route}?usr={user}",
            arguments = listOf(navArgument(name = "user") {
//                this.type = NavType.ParcelableType<User>
                this.defaultValue = "Guest"
            }
            )
        ) { backStackEntry ->
            DetailsScreen(
                navController = navController, name = backStackEntry.arguments?.getString("name")
            )
        }
    }
}