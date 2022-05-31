package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * a changer
 *
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

    public WriteSymptomDataToFile() {

    }

    @Override
    public void putSymptoms(HashMap<String, Integer> map) {

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
