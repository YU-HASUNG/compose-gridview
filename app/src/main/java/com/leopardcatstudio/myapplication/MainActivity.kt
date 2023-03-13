package com.leopardcatstudio.myapplication

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.leopardcatstudio.myapplication.model.TestDataModel
import com.leopardcatstudio.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        actionBar?.hide()

        setContent {
            ListControllerView()
        }
    }
}

@Composable
private fun ListControllerView(

){

}

@Composable
private fun ListView(

){

}

@Composable
private fun ListViewItemView(
    model: TestDataModel,
    onItemClick: (TestDataModel) -> Unit
){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 4.dp, vertical = 5.dp),
        shape = RoundedCornerShape(2.dp),
        elevation = 10
    ){

    }
}

