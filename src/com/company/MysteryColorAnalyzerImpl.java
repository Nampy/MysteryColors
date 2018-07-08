package com.company;

import java.util.*;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {

    public MysteryColorAnalyzerImpl(){
        // constructor to instantiate
    }
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        HashSet<Color> uniqueColors = new HashSet<>(mysteryColors);
        System.out.println(uniqueColors);
        return uniqueColors.size(); //returning the length of the unique colors
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int occurrences = Collections.frequency(mysteryColors, color);
        return occurrences;
    }
}
