package io.iprody.lessons.lesson8;

class StringWork {
    public int findSymbolOccurrence(String input, char symbolOccurrence) {
        int numberOfMatches = 0;
        int lenInput = input.length();

        for (int i = 0; i < lenInput; i++) {
            if (symbolOccurrence == input.charAt(i)) {
                numberOfMatches++;
            }
        }
        
        return numberOfMatches;
    }

    public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public String stringReverse(String original) {
        return new StringBuilder(original).reverse().toString();
    }

    public boolean isPalindrome(String original) {
        String reverseOriginal = stringReverse(original);
        return original.equalsIgnoreCase(reverseOriginal);
    }
}
