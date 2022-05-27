package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;

public class AnalyticsCounter {
    public static int headacheCount = 0;
    public static int rashCount = 0;
    public static int pupilCount = 0;

    // Entry Point
    public static void main(String args[]) throws Exception {

	// Instance of ReadSymptomDataFromFile class
	ReadSymptomDataFromFile readingFile = new ReadSymptomDataFromFile(
		"D:\\Dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");

	List<String> listOfSymptoms = readingFile.GetSymptoms();

	Collections.sort(listOfSymptoms);

	// To access element of a List
	// System.out.println(listOfSymptoms.get(23));

	// Iteration of listOfSymptoms

	/*
	 * for (String symptom : listOfSymptoms) { System.out.println(symptom); }
	 */

	// Count
	if (listOfSymptoms.size() == 0) {
	    System.out.println("La liste de symptomes est vide, ce n'est pas la peine de compter");
	} else {
	    int counter = 0;
	    System.out.println("Avant for");

	    for (String symptom : listOfSymptoms) { //
		// System.out.println("boucle du for");

		/*
		 * System.out.println("avant le 2eme if"); if (symptom == "anxiety") {
		 * System.out.println("passe dans le 2eme if"); counter += 1;
		 * System.out.println("Nombre de " + symptom + "=" + counter); } else {
		 * System.out.println("sort de la boucle"); }
		 */

		/*
		 * while (symptom.equals(listOfSymptoms.get(counter))) {
		 * System.out.println("boucle du while"); counter += 1;
		 * System.out.println("Nombre de " + listOfSymptoms.get(counter) + " : " +
		 * counter); }
		 */

		/*
		 * do { System.out.println(listOfSymptoms.get(counter)); counter += 1;
		 * 
		 * } while (symptom.equals(listOfSymptoms.get(counter)) &&
		 * symptom.equals(listOfSymptoms.get(counter + 1)));
		 */

		if (symptom.equals("anxiety")) {
		    System.out.println("YO !");
		    counter += 1;
		} else {
		    System.out.println("Nombre de anxiety : " + counter);
		}

	    }

	    /*
	     * else { System.out.println("Nombre de " + symptom + " : " + counter); }
	     * 
	     * 
	     * }
	     */
	}

    }

}
