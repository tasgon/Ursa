package org.tasgoon.ursa.api.minecraft

import java.net.URL

import scala.io.Source

object MinecraftVersionManager {
    val instance = getInstance("https://launchermeta.mojang.com/mc/game/version_manifest.json")

    def getInstance(url: String): MinecraftVersionList = {
        try {
            val versionURL = new URL(url)
            val data = Source.fromURL(versionURL).mkString
        }
        catch {
            case e: Any => {
                e.printStackTrace
            }
        }
        return null
    }
}