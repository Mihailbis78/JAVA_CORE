//package lesson_2_5_7;
//
//public class Test {
//    public static void main(String[] args) {
//
//        String[] badWords = {"плохой", "отстой"};
//        SpamAnalyzer spamA = new SpamAnalyzer(badWords);
//        NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
//        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(30);
//        TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};
//        System.out.println(checkLabels(analyzers, "Хороший текст для теста."));
//        System.out.println(checkLabels(analyzers, "Плохой текст теста, так к :("));
//        System.out.println(checkLabels(analyzers, "Плохой текст для теста, полный отстой."));
//        System.out.println(checkLabels(analyzers, "И это все, что вы хотели написать в комментариях. Да ну, вообще..."));
//    }
//
//    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
//        for (TextAnalyzer analyzer : analyzers) {
//            Label label = analyzer.processText(text);
//            if (label != Label.OK) {
//                return label;
//            }
//        }
//        return Label.OK;
//    }
//}
//
