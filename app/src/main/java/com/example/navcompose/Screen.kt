package com.example.navcompose

enum class Screen {
    AUTH, APP,MAIN,USER_LOGIN,
    SPLASH, HOME, PROFILE, FORMS, DETAILS, LOGIN, REGISTER, FORGET_PASSWORD, PRODUCTS, PRODUCTS_DETAILS
}

sealed class NavigationItem(val route: String) {
    data object Splash : NavigationItem(Screen.SPLASH.name)
    data object Home : NavigationItem(Screen.HOME.name)
    data object Profile : NavigationItem(Screen.PROFILE.name)
    data object Forms : NavigationItem(Screen.FORMS.name)
    data object Details : NavigationItem(Screen.DETAILS.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object Register : NavigationItem(Screen.REGISTER.name)
    data object ForgetPassword : NavigationItem(Screen.FORGET_PASSWORD.name)
    data object Products : NavigationItem(Screen.PRODUCTS.name)
    data object ProductsDetails : NavigationItem(Screen.PRODUCTS_DETAILS.name)
    data object AuthRoute : NavigationItem(Screen.AUTH.name)
    data object AppRoute : NavigationItem(Screen.APP.name)
    data object Main : NavigationItem(Screen.MAIN.name)
    data object UserLogin : NavigationItem(Screen.USER_LOGIN.name)
}