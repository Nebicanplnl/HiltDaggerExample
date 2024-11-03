package com.example.hiltdaggerexample.analytics

import javax.inject.Inject


class AnalyticsAdapter @Inject constructor(
     val service: AnalyticsService
)