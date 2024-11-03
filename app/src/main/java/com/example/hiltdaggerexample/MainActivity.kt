package com.example.hiltdaggerexample

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hiltdaggerexample.analytics.AnalyticsAdapter
import com.example.hiltdaggerexample.analytics.AnalyticsService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// Bu annotationla beraber şunu söylemiş oluyoruz. Android sınıflarına denk gelen hilt tarafında component sınıflar var generate edilmiş
// AndridEntryPoint diyerek main activityimze bu component sınıfları kullanabailir bunun içindeki dependiceiesleri kullanabiliriz.
// Bunu yaptıgımızda constructor injection yada field injectionları kullanabiliriz. MainAvtivityde constructor injection yapamayız.
// Çünkü
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsAdaper: AnalyticsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        defaultActivityCodes()

        //Manuel olarak yazarsak bu şekilde
//        analyticsAdaper = AnalyticsAdapter(object : AnalyticsService {
//            override fun analyticsMethods() {
//                Log.i("AnalticsAdapter", "AnalyticsAdapter run")
//            }
//        })

        analyticsAdaper.service.analyticsMethods()
    }

    private fun defaultActivityCodes() {
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}