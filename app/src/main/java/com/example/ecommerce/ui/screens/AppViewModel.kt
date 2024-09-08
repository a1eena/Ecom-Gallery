package com.example.ecommerce.ui.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.ecommerce.models.Article
import com.example.ecommerce.models.getArticle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class LoginState(
    val username:String = "",
    val password:String = "",
    val isLoginCompleted:Boolean = false,
    val isError: Boolean = false,
)

data class BlogState(
    val articleList: List<Article> = getArticle(),
    val selectedArticle: Article? = null
)

class AppViewModel(): ViewModel() {

    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()

    private val _blogState = MutableStateFlow((BlogState()))
    val blogState = _blogState.asStateFlow()

    //event logic for blogscreen
    fun onBlogEvent(event: BlogEvent) {
        when (event) {
            is BlogEvent.OnArticleClick -> {
                _blogState.update {
                    Log.d("Viewmodel", event.article.toString())
                    it.copy(selectedArticle = event.article)
                }
            }
        }
    }


    //event logic
    fun onLoginEvent(event: LoginEvent) {
        when (event) {
            LoginEvent.OnLoginClick -> {
                checkLogin()
            }

            is LoginEvent.OnPasswordChange -> {
                _loginState.update { it.copy(password = event.pwd) }
            }

            is LoginEvent.OnUsernameChange -> {
                _loginState.update { it.copy(username = event.name) }
            }

            LoginEvent.OnLogoutClick -> {
                _loginState.update {
                    it.copy(isLoginCompleted = false)
                }
            }

        }
    }
            private fun checkLogin() {
                val state = _loginState.value
                val authData = mapOf(
                    "hello" to "0000",
                    "alina" to "222"
                )
                authData.forEach { (un, pw) ->
                    if (state.username == un && state.password == pw) {
                        _loginState.update {
                            it.copy(
                                isLoginCompleted = true,
                                isError = false
                            )
                        }
                        return
                    }
                }
                _loginState.update { it.copy(isError = true) }
            }
        }


















