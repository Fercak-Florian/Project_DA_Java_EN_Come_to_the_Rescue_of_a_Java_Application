package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

    // Constructor
    public WriteSymptomDataToFile(HashMap<String, Integer> map) {

    }

    // Implementation of PutSymptoms method
    public void PutSymptoms(HashMap<String, Integer> map) {

	try {
	    FileWriter writer = new FileWriter("result.out");

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
	    }

	    writer.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}
