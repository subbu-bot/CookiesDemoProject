package com.cucumber.commonServices;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class PDFReader {
    /**
     * This function will return list of String with some line by line pattern from all pdf content

     */
    public List<String> getPdfContent(String path) throws IOException{
        File file = new File(path);
        PDDocument pdDocument = PDDocument.load(file);
        PDFTextStripper strip = new PDFTextStripper();
        String stripText = strip.getText(pdDocument);
        Stream<String> lines = stripText.lines();
        pdDocument.close();
        return lines.toList();
    }
}
