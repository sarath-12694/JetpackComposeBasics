package com.sarath.jetpack.basics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sarath.jetpack.basics.data.JobOpening


@Composable
fun JopOpeningItem(jobs: JobOpening) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(8.dp))
    ) {
        Row {
            JobOpeningImage(jobs = jobs)
            Column(
                modifier = Modifier
                    .padding(start = 4.dp, bottom = 4.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = jobs.jobName, style = typography.h6, modifier = Modifier.padding(), textAlign = TextAlign.Start)
                Text(text = jobs.jobStatus, style = typography.caption)
            }
        }
        Divider(modifier = Modifier.padding(end = 50.dp), color = Color.Blue)
    }
}

@Composable
fun JobOpeningImage(jobs: JobOpening){
    Image(painter = painterResource(id = jobs.jobImage), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier
        .padding(8.dp)
        .size(100.dp)
        .clip(
            RoundedCornerShape(corner = CornerSize(16.dp))
        ))

}