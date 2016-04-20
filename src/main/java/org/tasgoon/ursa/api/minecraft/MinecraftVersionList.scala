package org.tasgoon.ursa.api.minecraft

import java.util

import com.google.gson.annotations.SerializedName

/**
  * Created by tasgoon on 4/19/16.
  */

class MinecraftVersionList {
    class Version {
        var id: String = null
        var time: String = null
        var releaseTime: String = null
        @SerializedName("type") var profileType: String = null
        var url: String = null
    }

    class Latest {
        var snapshot: String = null
        var release: String = null
    }

    var latest: Latest = null
    var versions: util.List[Version] = null
}
