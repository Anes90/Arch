package com.tech387.architecture.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.tech387.architecture.data.Profile
import com.tech387.architecture.data.sorce.ProfileRepository

class MainViewModel(application: Application) : AndroidViewModel(application) { //MainViewModel nasljedjuje application context

    private val profileRepository = ProfileRepository() //Instanciran repozitorij

    val profiles = MutableLiveData<List<Profile>>() //Inicijalizovana izmjenjiva lista profila

    fun getProfiles() {
        profiles.value = profileRepository.getProfiles() //Profili iz repozitorija dodijeljeni izmjenjivoj listi koja je inicijalizovana
                                                         //u ovom ViewModelu
    }

    fun removeProfile(profile: Profile) {
        profileRepository.removeProfile(profile) //Uklanja profil iz repozitorija

        profiles.value = profileRepository.getProfiles() //Dohvata novu listu profila iz repozitorija (izmijenjenu nakon uklanjanja jednog profila
                                                         //dodijeljuje izmjenjivoj listi koja je inicijalizovana u ovom ViewModelu
    }

}