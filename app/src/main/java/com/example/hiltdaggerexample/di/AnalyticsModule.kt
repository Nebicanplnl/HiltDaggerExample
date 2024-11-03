package com.example.hiltdaggerexample.di

import com.example.hiltdaggerexample.analytics.AnalyticsService
import com.example.hiltdaggerexample.analytics.AnalyticsServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

// Module: Ben bilicemki bu benım Dependicies'leri yonettıgım bir modul sınıfı Hilte özel. Bunu yaparken bir bilgiye daha ihtiyacım var
// diyo ve Module yazdıgımızda benım buraya yazıcagım Dependicies'leri hangi lifecycle aralığında yöneticeğimi bana söyle diyor.
// Bu annotation InstallIn
// InstallIn'in içine ActivityComponent yadığımızda bu şu demek: ben bu modulun ıçındekı Dependicies'leri sadece activity sınıflarında
// kullanıcam demiş oluyoruz.
// Constructor Injection yapamadıgımız için module sınıfları oluşturuyoruz.


@Module
@InstallIn(ActivityComponent::class ) //dependencyleri sadece activity sınıfında kullanıcam diye sınırladı
abstract class AnalyticsModule{

    @Binds
    abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl):AnalyticsService
}

