package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;

public interface ISymptomCounter {
    // javadoc
    HashMap<String, Integer> getNumberOfSymptoms(List<String> symptomList);
}
