package lesson_2_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private static String[] NEGATIVE_KEYWORDS = {":(", "=(", ":|"};

    protected String[] getKeywords() {
            return NEGATIVE_KEYWORDS;
    }

    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
