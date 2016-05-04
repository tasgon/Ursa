package org.tasgoon.ursa.api.minecraft

import java.net.URL

import net.liftweb.json._

import scala.io.Source

object MinecraftVersionManager {
    val instance = getInstance("https://launchermeta.mojang.com/mc/game/version_manifest.json")
    implicit val formats = DefaultFormats

    def getInstance(url: String): MinecraftVersionList = {
        try {
            val data = Source.fromURL(new URL(url)).mkString.replaceAll("\"type\"", "\"versionType\"")
            //print(data)
            return parse(data).extract[MinecraftVersionList]
        }
        catch {
            case e: Any => {
                e.printStackTrace
            }
        }
        return null
    }
}