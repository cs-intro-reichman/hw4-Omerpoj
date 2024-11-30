public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0;i < sentences.length;i++){
            for(int j = 0;j < keywords.length;j++){
                System.out.println(contains(sentences[i],keywords[j]));
                if (contains(sentences[i] , keywords[j])) {
                    System.out.println(keywords[j]);
                }
            }
        }
    }
        /** If str1 contains str2, returns true; otherwise returns false. */
        public static boolean contains(String str1, String str2) {
            int index = 0;
            if (str2.length() > str1.length()) {
                return false;
            }
            while (str1.charAt(index) != str2.charAt(0) && index < str2.length()) {
                index++;
            }
            for(int i = 0;i < str2.length();i++){
                if (str1.charAt(index + i) != str2.charAt(i)) {
                    return false;                
                }
            }
            return true;
        }
}
