package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class is used to write into a file from a Map
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

    public WriteSymptomDataToFile() {

    }

    @Override
    public void putSymptoms(TreeMap<String, Integer> map) {

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
