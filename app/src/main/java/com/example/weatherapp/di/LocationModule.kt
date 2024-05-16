package com.example.weatherapp.di

import com.example.weatherapp.data.location.DefaultLocationTracker
import com.example.weatherapp.domain.location.LocationTracker
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker): LocationTracker
}