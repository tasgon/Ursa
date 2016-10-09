package org.tasgoon.ursa.api.minecraft

import java.net.URL

import net.liftweb.json._

import scala.io.Source

object MinecraftVersionManager {
    implicit val formats = DefaultFormats
    var versions: List[MinecraftVersion] = _
    populateVersions("https://launchermeta.mojang.com/mc/game/version_manifest.json")

    def populateVersions(url: String) = {
        try {
            val data = Source.fromURL(new URL(url)).mkString.replaceAll("\"type\"", "\"versionType\"")
            val json = parse(data)
            println(json \ "versions")
            versions = (json \ "versions").extract[List[MinecraftVersion]]
        }
        catch {
            case e: Any => {
                e.printStackTrace
            }
        }
    }
}