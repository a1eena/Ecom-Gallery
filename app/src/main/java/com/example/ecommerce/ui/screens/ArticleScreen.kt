package com.example.ecommerce.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.ecommerce.R
import com.example.ecommerce.models.getArticle

@Composable
fun ArticleScreen(
    modifier: Modifier = Modifier,
    blogState: BlogState,
    loginState: LoginState,
    onEvent: (BlogEvent) -> Unit = {},

    ) {
    BackHandler {
        onEvent(BlogEvent.OnArticleClick(null))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue.copy(alpha = 0.4f)),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .padding(5.dp)
                            .background(Color.White, shape = CircleShape),
                        contentAlignment = Alignment.Center,

                        ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "person",
                        )
                    }
                    Text(
                        text = " ${loginState.username}",
                        fontSize = 23.sp,
                        color = MaterialTheme.colorScheme.scrim,

                        )
                }

            }


val imgScale = 1f
        AsyncImage(
            blogState.selectedArticle?.imgUrl,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(500.dp)
                .padding(70.dp, 50.dp)

                .drawBehind {
                    drawCircle(
                        color = Color.Blue.copy(alpha = 0.1f),
                        radius = 700f,
                    )
                    drawContext.transform.scale(
                        scaleX = imgScale,
                        scaleY = imgScale
                    )
                    drawContext.transform.translate(
                        left = 0f,
                        top = 100f
                    )
                    drawCircle(
                        color = Color.Blue.copy(alpha = 0.2f),
                        radius = 600f,
                    )
                }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
               Text(
                    text = blogState.selectedArticle?.title+"𐫰" ?: "No Title",
                    style = MaterialTheme.typography.headlineSmall,
                   fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,

                )

            Text(
                    text = blogState.selectedArticle?.body?:"No Body",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(65.dp, 15.dp)
                )

                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = "Buy",
                        fontSize = 18.sp,
                    )
                    Icon(imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null,

                        )
                }
            Text(text = "⭐️⭐️⭐️⭐",
                modifier = Modifier.padding(20.dp))

            }
        }

    }




@Preview(showBackground = true)
@Composable
private fun ArticleScreenPreview() {
    ArticleScreen(
        blogState = BlogState(
            selectedArticle = getArticle().random()
        ),
        loginState = LoginState()


    )
}


