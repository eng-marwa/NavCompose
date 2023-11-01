package com.example.navcompose.custome_arguments


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
fun UserLoginScreen(navController: NavController) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val user = User(name = "marwa", userId = 101)
        Text("User Login Screen")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = {
            navController.navigate("${NavigationItem.Main.route}?user = {user}"){

            }
        }) {
            Text(text = "Navigate to Main")
        }

    }
}
