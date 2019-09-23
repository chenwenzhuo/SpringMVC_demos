package SetterBasedInjection;

public class TextEditor_SBI {
    private SpellingChecker_SBI spellingCheckerSBI;

    public SpellingChecker_SBI getSpellingCheckerSBI() {
        return spellingCheckerSBI;
    }

    public void setSpellingCheckerSBI(SpellingChecker_SBI spellingCheckerSBI) {
        System.out.println("Inside setSpellingChecker_SBI.");
        this.spellingCheckerSBI = spellingCheckerSBI;
    }

    public void checkSpelling() {
        spellingCheckerSBI.checkSpelling();
    }
}
