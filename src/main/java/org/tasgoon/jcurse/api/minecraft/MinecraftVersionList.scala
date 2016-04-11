package org.tasgoon.jcurse.api.minecraft

import java.net.URL
import java.util

object MinecraftVersionList {
    //val instance: MinecraftVersionList = getInstance

    val instance: MinecraftVersionList = {
        try {
            val versionURL = new URL("http://s3.amazonaws.com/Minecraft.Download/versions/versions.json")
            //versionURL.
        }
        catch {
            case e: Any => {
                e.printStackTrace
            }
        }
        null
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