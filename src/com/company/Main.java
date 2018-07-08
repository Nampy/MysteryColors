package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Color> colors = new ArrayList<>();
        // testing the colors
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);


        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
        System.out.println(mysteryColorAnalyzer.numberOfDistinctColors(colors)); // checking the distinct colors
        System.out.println(mysteryColorAnalyzer.colorOccurrence(colors,Color.BLUE));
    }
}
