package ConstructorBasedInjection;

public class TextEditor_CBI {
    private SpellingChecker_CBI spellingCheckerCBI;

    public TextEditor_CBI(SpellingChecker_CBI spellingCheckerCBI) {
        System.out.println("Inside TextEditor_CBI constructor.");
        this.spellingCheckerCBI = spellingCheckerCBI;
    }

    public void checkSpelling() {
        spellingCheckerCBI.checkSpelling();
    }
}
