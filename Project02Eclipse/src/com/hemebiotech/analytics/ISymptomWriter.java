package com.hemebiotech.analytics;

import java.util.HashMap;

/**
 * Anything that will write symptom data from a source into file. The important
 * part is, the file written by the operation, which is a list of Keys-Values
 * 
 * The implementation does not need to order the list
 * 
 */

public interface ISymptomWriter {
    /**
     * If no data is available, return an error message into the output file.
     * 
     * @return an output file listing the number of all Symptoms obtained from a
     * 
     */
    void PutSymptoms(HashMap<String, Integer> map);

}
