package org.mengtian;


import java.util.Arrays;

public class  NumberComparer {

    public String compare(String systemGenerated, String userInput) {
        if(systemGenerated.equals(userInput)) {
            return "4A0B";
        }

        char[] systemCharSets = systemGenerated.toCharArray();
        char[] userCharSets = userInput.toCharArray();

        int exactRightCount = 0;
        int digitRightCount = 0;

        for(int i = 0; i < 4; i++){
            if(systemCharSets[i] == userCharSets[i]){
                exactRightCount++;
                continue;
            }

            if(systemGenerated.indexOf(userCharSets[i]) >= 0) {
                digitRightCount++;
                continue;
            }
        }
        return String.format("%dA%dB", exactRightCount, digitRightCount);
    }
}
