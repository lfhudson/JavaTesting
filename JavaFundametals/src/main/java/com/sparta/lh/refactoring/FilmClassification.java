package com.sparta.lh.refactoring;

public class FilmClassification {

    public static String getClassificationsByAge(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 0) {
            throw new IllegalArgumentException("Age of viewer must be a valid age: " + ageOfViewer);
        }
        else if (ageOfViewer < 8)
        {
            result = "U films are available.";
        }
        else if (ageOfViewer < 12)
        {
            result = "U, PG films are available and 12A with an adult.";
        }
        else if (ageOfViewer < 15)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 18)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}