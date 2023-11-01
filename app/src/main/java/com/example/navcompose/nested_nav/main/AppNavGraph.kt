package com.example.navcompose.nested_nav.main

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navcompose.NavigationItem

//extension fun
fun NavGraphBuilder.appNavGraph(navController: NavController) {
    navigation(
        startDestination = NavigationItem.Products.route,
        route = NavigationItem.AppRoute.route
    ) {

        composable(NavigationItem.Products.route) { ProductScreen(navController) }
        composable(NavigationItem.ProductsDetails.route) { ProductDetailsScreen(navController) }
    }
}