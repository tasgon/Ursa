package org.tasgoon.ursa.data

object Profile {
    class ProfileType extends Enumeration {
        type ProfileType = Value
        val VANILLA, MODPACK = Value
    }
}

class Profile(var name: String, var profileType: Profile.ProfileType, var data: String) {
}