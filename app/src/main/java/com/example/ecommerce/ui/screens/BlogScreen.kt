package com.example.ecommerce.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.ecommerce.R
import com.example.ecommerce.models.Article

sealed class BlogEvent{
    data class OnArticleClick(val article: Article?) : BlogEvent()
}

@Composable
fun BlogScreen(
    modifier: Modifier = Modifier,
    blogState: BlogState,
    loginState: LoginState,
    onEvent: (BlogEvent) -> Unit = {},
    onLoginEvent: (LoginEvent) -> Unit = {}

    ) {


    Column(
        modifier = modifier.background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue.copy(alpha = 0.5f)),
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
                    color = MaterialTheme.colorScheme.onPrimary,

                    )

            }

        }
        Spacer(modifier = Modifier.height(10.dp))
        val photo = listOf(
            "Step into style with our latest collection of trendy footwear at unbeatable prices!👠\n",
            " Elevate your outfit with elegant purses, now at a price you’ll love!👜",
            "Don’t miss out on our limited-time offers️🎉   grab your favorite products for less!🛍️",
            "Enhance your beauty routine with top-brand cosmetics, now available at special rates!💄",
            "Complete your look with chic sunglasses🕶️ and hats👒, now at an exclusive discount!🏷️",
        )
        val photooimages = listOf(
            R.drawable.boot,
            R.drawable.bag2,
            R.drawable.photo2,
            R.drawable.cos2,
            R.drawable.hat,

        )
        LazyRow(
            modifier = Modifier
                .background(Color.Blue.copy(alpha = 0.4f)),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            itemsIndexed(photo) { index, name ->
                Card(
                    colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer),
                    modifier = Modifier
                        .padding(6.dp)
                        .height(210.dp)


//
                ) {
                    Row {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .size(200.dp)


                        ) {
                            Column {
                                Text(
                                    text = name,
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontStyle = FontStyle.Italic
                                )
                            }
                        }
                        Image(painter = painterResource(id = photooimages[index], ),
                            contentDescription = null,
                            modifier = Modifier
                                .size(200.dp)
                                .drawBehind {
                                    drawCircle(
                                        color = Color.Blue.copy(alpha = 0.1f),
                                        radius = 300f,
                                    )
                                    drawCircle(
                                        color = Color.Red.copy(alpha = 0.2f),
                                        radius = 250f,
                                    )
                                }


                        )

                    }


                }
            }
        }
        Spacer(modifier = Modifier.height(5.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(5.dp)
            ) {
                items(blogState.articleList) { article ->
                    ArticleCard(article = article) { selectedArticle ->
                        onEvent(BlogEvent.OnArticleClick(selectedArticle))


                    }
                }
            }
        }

    }

    @Composable
    fun ArticleCard(
        modifier: Modifier = Modifier,
        article: Article,
        onArticleSelected: (Article) -> Unit,
    ) {
        Card(
            onClick = { onArticleSelected(article) },
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                AsyncImage(
                    article.imgUrl,
                    contentDescription = article.title,
                    modifier = Modifier.height(350.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.BottomStart)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.White
                                ),
                                startY = 0f,
                                endY = 180f,
                            )
                        )
                        .padding(10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Text(
                            text = article.title + "🌸",
                            color = MaterialTheme.colorScheme.scrim,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                            .height(0.dp)
                    )

                    Text(
                        text = "$" + "${article.price}" + "🏷",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue.copy(alpha = 0.7f),
                    )


                }
            }

        }

    }







@Preview(showBackground = true)
@Composable
private fun BlogScreenPreview() {
    BlogScreen(
        blogState = BlogState(),
        loginState = LoginState(
        ),
        onEvent = {}
    )

}