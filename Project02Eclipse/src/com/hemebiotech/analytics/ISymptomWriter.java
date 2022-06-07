package com.hemebiotech.analytics;

import java.util.Map;

/**
 * This interface is used to write into a file from a Map
 */
public interface ISymptomWriter {
    /**
     * Create an output file containing each symptom with their occurrences
     * 
     * @param Map of symptoms and a String output file name
     * @return a output file name
     */
    String putSymptoms(Map<String, Integer> map, String outPutFileName);
}
