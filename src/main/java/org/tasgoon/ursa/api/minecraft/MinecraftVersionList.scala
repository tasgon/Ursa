package org.tasgoon.ursa.api.minecraft

import java.net.URL
import java.util

object MinecraftVersionList {
    val instance = getInstance("http://s3.amazonaws.com/Minecraft.Download/versions/versions.json")

    def getInstance(url: String): MinecraftVersionList = {
        try {
            val versionURL = new URL(url)
            //versionURL.
        }
        catch {
            case e: Any => {
                e.printStackTrace
            }
        }
        return null
    }
}

class MinecraftVersionList {

    class Version {
        var id: String = null
        var time: String = null
        var releaseTime: String = null
        var `type`: String = null
    }

    var latest: util.Map[String, String] = null
    var versions: util.List[MinecraftVersionList#Version] = null
}