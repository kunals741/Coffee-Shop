package com.example.coffeeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeshop.ui.theme.CoffeeShopTheme
import com.example.coffeeshop.ui.theme.darkGrayColor
import com.example.coffeeshop.ui.theme.secondaryColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeShopTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                ) {
                    Image(
                        painterResource(id = R.drawable.ic_coffee_starting),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth
                    )
                    Text(
                        text = "Coffee so good, your taste buds will love it.",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = (34.sp),
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 42.sp,
                        modifier = Modifier
                            .padding(30.dp, 0.dp)
                            .wrapContentHeight()
                    )
                    Text(
                        text = "The best grain, the finest roast, the powerful flavor.",
                        color = darkGrayColor,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(30.dp, 8.dp, 30.dp, 0.dp),
                        fontSize = 14.sp
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(secondaryColor),
                        shape = RoundedCornerShape(16.dp),
                        contentPadding = PaddingValues(0.dp,20.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(30.dp, 24.dp)
                    ) {
                        Text(
                            text = "Get Started",
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}


