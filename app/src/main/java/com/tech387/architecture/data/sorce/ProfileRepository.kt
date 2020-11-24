package com.tech387.architecture.data.sorce

import com.tech387.architecture.data.Profile

class ProfileRepository {

    private val profiles = mutableListOf(
        Profile("1", "Samir", "samir@gmail.com"),
        Profile("2", "Anes", "anes@gmail.com"),
        Profile("3", "Arslan", "arslan@gmail.com"),
        Profile("4", "Enver", "enver@gmail.com"),
        Profile("5", "Denis", "denis@gmail.com"),
    )

    fun getProfiles(): List<Profile> {
        return profiles
    }

    fun removeProfile(profile: Profile) {
        profiles.remove(profile)
    }

}