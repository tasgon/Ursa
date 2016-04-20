package org.tasgoon.ursa.api

import java.io.IOException
import java.net.URL
import org.apache.commons.io.IOUtils
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException

object Utility {
    @throws[JsonSyntaxException]
    @throws[IOException]
    def jsonURLtoClass[T](url: URL, classOfT: Class[T]) {
    }
}