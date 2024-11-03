package com.example.hiltdaggerexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// Hilt'in entegrasyonunun yapıldığını belirtmek için bu annotationı kullanıyoruz.
@HiltAndroidApp
class App: Application() {
}