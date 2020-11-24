package com.tech387.architecture.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.tech387.architecture.data.Profile
import com.tech387.architecture.data.sorce.ProfileRepository

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val profileRepository = ProfileRepository()

    val profiles = MutableLiveData<List<Profile>>()

    fun getProfiles() {
        profiles.value = profileRepository.getProfiles()
    }

    fun removeProfile(profile: Profile) {
        profileRepository.removeProfile(profile)

        profiles.value = profileRepository.getProfiles()
    }

}