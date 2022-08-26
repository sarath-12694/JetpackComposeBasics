package com.sarath.jetpack.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sarath.jetpack.basics.data.JobOpenings

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowJobListItem()

        }
    }
}

@Preview
@Composable
fun ShowJobListItem(){
    val jobList = remember {
        JobOpenings.jobList
    }
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp)
    ){
        items(items = jobList, itemContent = {
            JopOpeningItem(it)
        })
    }


}