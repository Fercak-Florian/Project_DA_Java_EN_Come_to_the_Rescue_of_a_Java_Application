package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * This interface is used to count number of each symptoms
 */

public interface ISymptomCounter {
    /**
     * @param a (sorted) List of String containing symptoms
     * @return a TreeMap Key/Value containing Symptom/Number of symptoms
     */
    Map<String, Integer> getNumberOfSymptoms(List<String> symptomList);
}
