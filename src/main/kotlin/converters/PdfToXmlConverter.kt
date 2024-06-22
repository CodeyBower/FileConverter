package org.example.converters

import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

class PdfToXmlConverter {

    fun convert(pdfFilePath: String): String {
        val document = PDDocument.load(File(pdfFilePath))
        val stripper = PDFTextStripper()
        val text = stripper.getText(document)

        val xmlDocument = XmlDocument() // Construct your XML document from the extracted text
        return xmlDocument.toString() // Return the XML document as a string
    }
}