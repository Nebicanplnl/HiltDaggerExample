package com.example.hiltdaggerexample.analytics

// Constructor Injection, bir nesne oluşturulurken çalışır ve nesneye belirli bağımlılıkları sağlamak için kullanılır.
// Ancak bir interface'ten nesne oluşturulamayacağı için constructor injection kullanılması mümkün değildir.

interface AnalyticsService {
    fun analyticsMethods()
}