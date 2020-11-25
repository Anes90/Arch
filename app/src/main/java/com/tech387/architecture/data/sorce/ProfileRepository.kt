package com.tech387.architecture.data.sorce

import com.tech387.architecture.data.Profile

class ProfileRepository {

    private val profiles = mutableListOf(
        Profile("1", "Samir", "samir@gmail.com"),
        Profile("2", "Anes", "anes@gmail.com"),
        Profile("3", "Arslan", "arslan@gmail.com"),
        Profile("4", "Enver", "enver@gmail.com"),
        Profile("5", "Denis", "denis@gmail.com"),
        Profile("6", "Velid", "velid@gmail.com"),
        Profile("7", "Sinan", "sinan@gmail.com"),
        Profile("8", "Alen", "alen@gmail.com"),
        Profile("9", "Hajrudin", "hajrudin@gmail.com"),
        Profile("10", "Zlatan", "zlatan@gmail.com"),
    )

    fun getProfiles(): List<Profile> {
        return profiles //Vraca listu profila iz ovog repozitorija
    }

    fun removeProfile(profile: Profile) {
        profiles.remove(profile) //Funkcija za uklanjanje profila iz liste
    }

    //Added by Anes --------------------------
    fun filterProfile(enteredText: String): MutableList<Profile> {
        var filteredProfiles = mutableListOf<Profile>()

        for(i in 0 until profiles.size){
            if(profiles[i].name.contains(enteredText, true))
            {
                filteredProfiles.add(profiles[i])
            }
        }

        return filteredProfiles
    }
    //Added by Anes --------------------------

}