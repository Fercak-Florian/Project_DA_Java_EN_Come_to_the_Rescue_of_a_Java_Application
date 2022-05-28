package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * 
     * @param filepath a full or partial path to file with symptom strings in it,
     *                 one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
	this.filepath = filepath;
    }

    @Override
    public List<String> GetSymptoms() {
	// Declaration of a flexible List called "result"
	ArrayList<String> result = new ArrayList<String>();

	// If file exists
	if (filepath != null) {
	    // Try to read it
	    try {
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		String line = reader.readLine();

		while (line != null) {
		    result.add(line);
		    line = reader.readLine(); // Get another symptom
		}
		reader.close();
		// If file doesn't exists
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}

	return result;
    }

}
