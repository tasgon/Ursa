package org.tasgoon.ursa.api.minecraft


/**
  * Created by tasgoon on 4/19/16.
  */

case class MinecraftVersion(id: String, time: String, releaseTime: String, versionType: String, url: String)

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
