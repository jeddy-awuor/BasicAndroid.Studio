package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
 LoginPage()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun LoginPage() {
    var name by remember {  mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ) {
        Image(painter = painterResource(id = R.drawable.cat) ,
            contentDescription = "cat",
            modifier = Modifier.size(200.dp),
        )

        Divider()
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = name,
            onValueChange ={
                name=it
            },
            placeholder = { Text(text = "Name")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.None),
            singleLine = true,
            modifier = Modifier
                .padding(15.dp)
            )

        OutlinedTextField(value = password,
            onValueChange ={
                password=it
            },
            placeholder = { Text(text = "Passcode")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.None),
            singleLine = true,
            modifier = Modifier
                .padding(15.dp)
        )
        Button(onClick = {
                         context.startActivity(Intent(context,LoginActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "Login")
        }



    }















}

@Preview(showBackground = true)
@Composable
fun Login() {
LoginPage()
}