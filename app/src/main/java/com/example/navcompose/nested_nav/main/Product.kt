package com.example.navcompose.nested_nav.main

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
fun ProductScreen(navController: NavController) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Products Screen")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = {
            navController.navigate(NavigationItem.ProductsDetails.route)
        }) {
            Text(text = "Navigate to Product Details")
        }
    }
}
