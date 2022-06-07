package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

/**
 * This class is used to write into a file from a Map and implements the
 * ISymptomWriter interface
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

    public WriteSymptomDataToFile() {

    }

    /**
     * @param a Map of symptoms and a output file name
     * 
     *          Create an output file containing each symptom with their occurrences
     */
    @Override
    public String putSymptoms(Map<String, Integer> map, String outPutFileName) {

	try {
	    FileWriter writer = new FileWriter(outPutFileName);

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
	    }

	    writer.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return outPutFileName;
    }
}
