package org.example.models

class XmlDocument {
    val rootElement = "manual"
    val content: String = ""

    override fun toString(): String {
        return """
            |<$rootElement>
            |   $content
            |</$rootElement>
            """.trimMargin()
    }
}