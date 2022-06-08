package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to read lines from a file and implements the
 * ISymptomReader interface
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * This constructor is used to create an object used to read a file containing
     * String
     * 
     * @param filepath a full or partial path to file with symptom String in it, one
     *                 per line
     */
    public ReadSymptomDataFromFile(String filepath) {
	this.filepath = filepath;
    }

    /**
     * @return an ArrayList containing all the String from file
     */
    @Override
    public List<String> getSymptoms() {
	ArrayList<String> result = new ArrayList<String>();
	if (filepath != null) {
	    try {
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		String line = reader.readLine();

		while (line != null) {
		    result.add(line);
		    line = reader.readLine();
		}
		reader.close();

	    } catch (IOException e) {
		e.printStackTrace();
	    }
	} else {
	    result.add(null);
	}
	return result;
    }
}
