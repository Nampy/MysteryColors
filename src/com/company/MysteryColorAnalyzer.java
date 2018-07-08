package com.company;

import java.util.List;

public interface MysteryColorAnalyzer {
    // determine how many distinct colors are given in the given list
    int numberOfDistinctColors(List<Color> mysteryColors);
    // how often a specific color is in the given list
    int colorOccurrence(List<Color> mysteryColors, Color color);
}
