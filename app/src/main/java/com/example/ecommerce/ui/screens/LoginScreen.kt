package com.example.ecommerce.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerce.R


sealed class LoginEvent{

    data class OnUsernameChange(val name:String): LoginEvent()
    data class OnPasswordChange(val pwd:String): LoginEvent()
    data object OnLoginClick: LoginEvent()
    data object OnLogoutClick: LoginEvent()

}
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginState,
    onEvent: (LoginEvent) -> Unit = {},


    ) {
    var isFormVisible by remember { mutableStateOf(false) }
    Box(

        modifier = Modifier
            .background(Color.Blue.copy(alpha = 0.1f))
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.front),
                contentDescription = null,
                modifier = Modifier
                    .padding(0.dp)
                    .size(250.dp)

            )


            Text(
                text = "Product Gallery",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.ExtraBold,
                color = MaterialTheme.colorScheme.primary,
                fontSize = 24.sp,
            )
            Spacer(modifier = Modifier
                .width(8.dp)
                .height(60.dp))



            AnimatedVisibility(visible = !isFormVisible) {



                ElevatedButton(onClick = { isFormVisible = true }) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)

                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(text = "Login",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .width(46.dp))
                }

            }

            AnimatedVisibility(visible = isFormVisible) {
                Card(
                    modifier = Modifier
                        .padding(16.dp)

                ) {
                    Column(
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.surfaceContainer)
                            .fillMaxWidth()
                            .padding(32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        TextField(
                            value = state.username,
                            onValueChange = { onEvent(LoginEvent.OnUsernameChange(it)) },
                            label = { Text("Username") },
                            isError = state.isError,
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Person,
                                    contentDescription = null
                                )
                            },

                        )
                        TextField(
                            value = state.password,
                            onValueChange = { onEvent(LoginEvent.OnPasswordChange(it)) },
                            label = { Text("Password") },
                            isError = state.isError,
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Lock,
                                    contentDescription = null
                                )
                            },
                            visualTransformation = PasswordVisualTransformation()
                        )

                        ElevatedButton(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            onClick = { onEvent(LoginEvent.OnLoginClick) }) {
                            Icon(
                                imageVector = Icons.Default.AccountCircle,
                                contentDescription = null,
                                modifier = Modifier.size(30.dp)

                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text(text = "Login",fontSize = 18.sp,
                                modifier = Modifier
                                    .width(46.dp))
                        }
                        IconButton(onClick = { isFormVisible = false }) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }

                }

            }
        }
    }
}





@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        state = LoginState ()
    )
}



