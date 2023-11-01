package com.example.navcompose.basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navcompose.NavigationItem

@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Profile Screen")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = {
            //navController.navigateUp()
            //to close immediately after navigate to Splash
            navController.navigate(NavigationItem.Splash.route) {
                popUpTo(NavigationItem.Splash.route) {
                    //to prevent double back press
                    inclusive = true
                }
            }
        }) {
            Text(text = "Navigate Back")
        }
    }
}