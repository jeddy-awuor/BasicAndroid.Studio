package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class trying : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
 imh()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun imh(){
    var name by remember {  mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue()) }
    var jina by remember { mutableStateOf(TextFieldValue()) }
  Box(modifier = Modifier.fillMaxWidth()) {
      Image(
          painter = painterResource(id = R.drawable.img_1) ,
          contentDescription = "logo",
          contentScale = ContentScale.FillBounds,
          modifier = Modifier.matchParentSize()
      )
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Top,
          modifier = Modifier.fillMaxSize()
      ){
          Text(
              text = "Welcome to android",
              color = Color.Black,
              fontFamily = FontFamily.Cursive,
              fontSize = 30.sp,
              modifier = Modifier
                  .padding(20.dp)
          )

          Spacer(modifier = Modifier.height(25.dp))

          OutlinedTextField(value = name,
              label ={
                  Text(text = "Name",
                      fontFamily = FontFamily.Cursive,
                      fontSize = 20.sp,
                      color = Color.Black,
                  )
                     },
              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
              colors = TextFieldDefaults.outlinedTextFieldColors(
                  unfocusedBorderColor = Color.Black,
                  focusedBorderColor = Color(red = 72, green = 70, blue = 94, alpha = 255),
                  textColor = Color.Blue),
              shape = RoundedCornerShape(25.dp),
              onValueChange = {
                  name = it
              })

          Spacer(modifier = Modifier.height(10.dp))

          OutlinedTextField(value = email,
              label = { Text(text = "Email",
                      fontFamily = FontFamily.Cursive,
                  color = Color.Black,
                  fontSize = 20.sp,)},
              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
              colors = TextFieldDefaults.outlinedTextFieldColors(
                  focusedBorderColor = Color(red = 72, green = 70, blue = 94, alpha = 255),
                  unfocusedBorderColor = Color.Black,
                  textColor = Color.Red),
              shape = RoundedCornerShape(25.dp),
              onValueChange ={
                  email=it
              },

          )

          Spacer(modifier = Modifier.height(10.dp)) //add space in between vertically

          OutlinedTextField(value = jina,
              label = { Text(text = "Password",
                  fontFamily = FontFamily.Cursive,
                  color = Color.Black,
                  fontSize = 20.sp,)},
              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
              colors = TextFieldDefaults.outlinedTextFieldColors(
                  focusedBorderColor = Color(red = 72, green = 70, blue = 94, alpha = 255),
                  unfocusedBorderColor = Color.Black,
                  textColor = Color(red = 232, green = 210 , blue = 187, alpha = 255)

                  ),
              shape = RoundedCornerShape(25.dp),
              onValueChange ={
                  jina=it
              },

          )
          Spacer(modifier = Modifier.height(10.dp))

          Button(
              onClick = { /*TODO*/ },
              colors = ButtonDefaults.buttonColors(
                  contentColor = Color.Black,
                  containerColor = Color(red = 195, green = 99, blue = 97, alpha = 255)
              ),
          ){
              Text(text = "Login",
                  style = TextStyle(letterSpacing = 2.sp),
                  fontFamily = FontFamily.Cursive,
                  fontSize = 24.sp,
              )
          }
      }
      }
      }


    //creates as background image


@Preview(showBackground = true)
@Composable
fun tryPreview() {
 imh()
}