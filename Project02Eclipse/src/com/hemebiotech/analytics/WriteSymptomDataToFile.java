package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

/**
 * This class is used to write into a file from a Map and implements the
 * ISymptomWriter interface
 */

public class WriteSymptomDataToFile implements ISymptomWriter {
    /**
     * @param an order List of symptoms and Create an output file containing each
     *           symptom with their occurrences
     */
    public WriteSymptomDataToFile() {

    }

    @Override
    public void putSymptoms(Map<String, Integer> map, String outPutFileName) {

	try {
	    FileWriter writer = new FileWriter(outPutFileName);

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
	    }

	    writer.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
