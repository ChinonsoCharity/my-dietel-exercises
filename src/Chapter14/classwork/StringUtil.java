package Chapter14.classwork;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    private String word;

    public StringUtil(String word) {
        this.word = word;
    }

    public int lastIndexOf(char character) {
        int index = -1;
        for (int i = 0; i <= word.length(); i++) {
            if (word.charAt(i) == character) {
                index = i;
            }
        }
        return index;
    }

    //
    public int indexOf(char character) {
        int index = -1;
        for (int i = 0; i <= word.length(); i++) {
            if (word.charAt(i) == character) {
                return i;
            }
        }
        return index;
    }

    //
    public int lastIndexOf(boolean shouldIgnoreCase, char character) {
        int index = -1;
        if (shouldIgnoreCase) {
            word = word.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i <= word.length(); i++) {
                if (word.charAt(i) == character) {
                    index = i;
                }
            }
            return index;
        } else {
            lastIndexOf(character);
        }
        return index;
    }

    //
    public int indexOf(boolean shouldIgnoreCase, char character) {
        int index = -1;
        if (shouldIgnoreCase) {
            word = word.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i <= word.length(); i++) {
                if (word.charAt(i) == character) {
                    return i;
                }
            }
            return index;
        } else {
            indexOf(character);
        }
        return index;
    }

    public int countOf(char character) {
        int index = 0;
        int count = 0;
        for (int i = 0; i <= word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public String[] split(String delimiter) {
        if (delimiter.equals("")) {
            String[] splitString = new String[word.length()];
            for (int i = 0; i < word.length(); i++) {
                splitString[i] = String.valueOf(word.charAt(i));
            }
            return splitString;
        }
        int length = delimiter.length();
        int lastIndex = 0;
        List<String> splitString = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (i + 1 - length >= 0) {
                String subStringOne = word.substring(i - length + 1, i + 1);
                if (subStringOne.equals(delimiter)) {
                    String subString = word.substring(lastIndex, i + 1 - length);
                    if (!subString.equals("")) {
                        splitString.add(subString);
                    }
                    lastIndex = i + 1;
                }
            }
        }
        splitString.add(word.substring(lastIndex));
        String[] splitStringArray = new String[splitString.size()];
        for (int i = 0; i < splitStringArray.length; i++) {
            splitStringArray[i] = splitString.get(i);
        }
        return splitStringArray;
    }
}