package com.example.ecommerce.models

data class Article(
    val imgUrl:String,
    val title:String,
    val body:String,

    val price:Int,
)

fun getArticle(): List<Article>{
    return listOf(
        Article(

           imgUrl = "https://plus.unsplash.com/premium_photo-1675186049297-035b3f692c04?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDh8fHxlbnwwfHx8fHw%3D",
            title = "Shadow",
            body = "A sleek, contemporary black coat designed to turn heads and elevate your style.",
            price = 200,


        ), Article(
            imgUrl = "https://plus.unsplash.com/premium_photo-1675186049366-64a655f8f537?q=80&w=2487&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Flamingo",
            body = "A vibrant pink coat that stands out with a bold and playful flair.",
            price = 120,


        ), Article(
            imgUrl = "https://images.unsplash.com/photo-1591047139829-d91aecb6caea?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDF8fHxlbnwwfHx8fHw%3D",
            title = "Sand ",
            body = "A vibrant brown jacket that stands out with a bold, exotic flair.",
            price = 3300,


        ), Article(
            imgUrl = "https://images.unsplash.com/photo-1434389677669-e08b4cac3105?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fHw%3D",
            title = "Glacier",
            body = "A high-point of style, featuring a sharp, triangular pattern that stands out in classic white.",
            price = 450,

        ), Article(
            imgUrl = "https://plus.unsplash.com/premium_photo-1675186049409-f9f8f60ebb5e?q=80&w=2487&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Crimson",
            body = "A rich, muted red with a touch of elegance, perfect for a sophisticated and understated look.",
            price = 200,


        ), Article(
            imgUrl = "https://images.unsplash.com/photo-1678884399113-0a2b079a31f5?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDl8fHxlbnwwfHx8fHw%3D",
            title = "Frost",
            body = "Embrace the chill in style with this sleek, white puff jacket.",
            price = 2000,


        ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1551028719-00167b16eac5?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDF8fHxlbnwwfHx8fHw%3D",
            title = "Raven",
            body = "A fiery black leather jacket with a rebellious spirit.",
            price = 1000,


        ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1585488433963-2e35fb083e52?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE1fHx8ZW58MHx8fHx8",
            title = "Tangerine",
            body = "A vibrant, zesty orange purse that adds a splash of citrusy cheer to any outfit.",
            price = 1050,


        ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1598099947145-e85739e7ca28?q=80&w=2535&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Hazel",
            body = "A rich, warm brown reminiscent of creamy cocoa. Perfect for a cozy, stylish touch.",
            price = 1500,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1612902456551-333ac5afa26e?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDF8fHxlbnwwfHx8fHw%3D",
            title = "Daffodil",
            body = "Fresh and lively, reminiscent of blooming daffodils, adding a splash of springtime joy.",
            price = 1200,
          //  productname = "cycle",

            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1575202332411-b01fe9ace7a8?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDF8fHxlbnwwfHx8fHw%3D",
            title = "Cloud",
            body = "Clear and serene like a summer sky, ideal for a calm, cool statement piece.",
            price = 1100,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1585488763177-bde7d15fd3cf?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDN8fHxlbnwwfHx8fHw%3D",
            title = "Blossom",
            body = "Light and delicate, with a hint of warm peach, perfect for a soft, feminine flair.",
            price = 1990,


            ),

        Article(
            imgUrl = "https://images.unsplash.com/photo-1583623733237-4d5764a9dc82?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MTl8WmR5YUxJMDNmSTR8fGVufDB8fHx8fA%3D%3D",
            title = "LV",
            body = "Reflecting the rich, luxurious feel of an LV purse, perfect for a statement piece.",
            price = 2560,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1584735174914-6b1272458e3e?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE4fHx8ZW58MHx8fHx8",
            title = "NIKE-Chalk",
            body = "Playful and vibrant sneakers in soft pink.",
            price = 199,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1612181346599-a6bfbd67be86?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE5fHx8ZW58MHx8fHx8",
            title = "NIKE-Fuchsia",
            body = "Classic white sneakers with a fresh, clean look.",
            price = 890,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1603808033192-082d6919d3e1?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDV8fHxlbnwwfHx8fHw%3D",
            title = "Espresso",
            body = "Elegant, versatile shoes in a rich brown.",
            price = 350,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1609336348831-959d5926d686?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8M3x6bi01MnhSeWpld3x8ZW58MHx8fHx8",
            title = "Python",
            body = "Bold boots featuring a stylish snake print pattern.",
            price = 1290,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1543163521-1bf539c55dd2?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDV8fHxlbnwwfHx8fHw%3D",
            title = "Bloom",
            body = "Charming heels adorned with a delicate floral design.",
            price = 1000,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1564051806-be616e3bdcec?q=80&w=2564&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
            title = "Gem",
            body = "Glamorous heels with dazzling diamond embellishments.",
            price = 1020,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1590099033615-be195f8d575c?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHx8",
            title = "Sand",
            body = "Elegant heels in a subtle, skin-tone shade.",
            price = 990,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1689367436414-7acc3fdc3e2a?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fGFjZXNzb3JpZXN8ZW58MHx8MHx8fDA%3D",
            title = "Aura",
            body = "Emits a subtle, luxurious golden glow",
            price = 999,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1617038220319-276d3cfab638?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHx8",
            title = "Twirl",
            body = "Designed with a spiraling shape for a dynamic look.",
            price = 345,


            ),
        Article(
            imgUrl = "https://plus.unsplash.com/premium_photo-1681276169450-4504a2442173?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDIwfHx8ZW58MHx8fHx8",
            title = "Starlight",
            body = "Exudes high-end elegance and opulence",
            price = 899,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1535632066927-ab7c9ab60908?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHx8",
            title = "Sapphire",
            body = "Displays a deep, rich blue sparkle.",
            price = 740,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1585123334904-845d60e97b29?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDEwfHx8ZW58MHx8fHx8",
            title = "Sea",
            body = "Features a timeless design with a clean, minimalistic face, ideal for versatile and understated elegance.",
            price = 1300,
         //   productname = "cycle",

            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1662384197911-e82189f4dc60?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE2fHx8ZW58MHx8fHx8",
            title = "Rolex",
            body = "Features a deep, captivating blue reminiscent of the sea, exuding both style and refinement.",
            price = 1040,


            ),
        Article(
            imgUrl = "https://images.unsplash.com/photo-1567333126229-db29200c25f1?w=800&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fHw%3D",
            title = "Sun",
            body = "Provides protection and a stylish barrier against bright sunlight, perfect for adding a cool edge to any outfit.",
            price = 1660,


            ),
    )
}
