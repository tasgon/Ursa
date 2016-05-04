package org.tasgoon.ursa.api.minecraft

import java.util

/**
  * Created by tasgoon on 4/19/16.
  */

case class Version(id: String, time: String, releaseTime: String, versionType: String, url: String)
case class Latest(snapshot: String, release: String)
case class MinecraftVersionList(latest: Latest, versions: util.List[Version])

/*class MinecraftVersionList {
    class Version {
        var id: String = null
        var time: String = null
        var releaseTime: String = null
        var versionType: String = null
        var url: String = null
    }

    class Latest {
        var snapshot: String = null
        var release: String = null
    }

    var latest: Latest = null
    var versions: util.List[Version] = null
}*/
