package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface ISymptomCounter {
    // javadoc
    TreeMap<String, Integer> getNumberOfSymptoms(List<String> symptomList);
}
