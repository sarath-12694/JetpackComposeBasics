package com.sarath.jetpack.basics.data

import android.graphics.drawable.Drawable
import androidx.compose.runtime.remember
import com.sarath.jetpack.basics.R

data class JobOpening(
    val id: String,
    val jobName: String,
    val jobStatus: String,
    val jobImage: Int
)

object JobOpenings{
          val jobList = listOf<JobOpening>(
              JobOpening("1","ANDDROID", "In-Progress", R.drawable.ic_job_opening),
              JobOpening("2","IOS", "Filled", R.drawable.ic_job_opening),
              JobOpening("3","WEB", "Declined", R.drawable.ic_job_opening),
              JobOpening("1","FLUTTER", "Qualified", R.drawable.ic_job_opening),
              JobOpening("2","KMM", "In-Progress", R.drawable.ic_job_opening),
              JobOpening("3","TESTING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("1","SERVER", "In-Filled", R.drawable.ic_job_opening),
              JobOpening("2","SUPPORT", "In-Declined", R.drawable.ic_job_opening) ,
              JobOpening("3","MARKETING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("3","WEB", "Declined", R.drawable.ic_job_opening),
              JobOpening("1","FLUTTER", "Qualified", R.drawable.ic_job_opening),
              JobOpening("2","KMM", "In-Progress", R.drawable.ic_job_opening),
              JobOpening("3","TESTING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("1","SERVER", "In-Filled", R.drawable.ic_job_opening),
              JobOpening("2","KMM", "In-Progress", R.drawable.ic_job_opening),
              JobOpening("3","TESTING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("1","SERVER", "In-Filled", R.drawable.ic_job_opening),
              JobOpening("2","SUPPORT", "In-Declined", R.drawable.ic_job_opening) ,
              JobOpening("3","MARKETING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("3","WEB", "Declined", R.drawable.ic_job_opening),
              JobOpening("3","MARKETING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("3","WEB", "Declined", R.drawable.ic_job_opening),
              JobOpening("1","FLUTTER", "Qualified", R.drawable.ic_job_opening),
              JobOpening("2","KMM", "In-Progress", R.drawable.ic_job_opening),
              JobOpening("3","TESTING", "In-Declined", R.drawable.ic_job_opening),
              JobOpening("1","SERVER", "In-Filled", R.drawable.ic_job_opening),
              JobOpening("2","KMM", "In-Progress", R.drawable.ic_job_opening),
              JobOpening("3","TESTING", "In-Declined", R.drawable.ic_job_opening)

          )
}