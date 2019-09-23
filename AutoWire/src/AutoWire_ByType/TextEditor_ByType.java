package AutoWire_ByType;

public class TextEditor_ByType {
    private SpellingChecker_ByType spellingChecker_byType;
    private String name;

    public SpellingChecker_ByType getSpellingChecker_byType() {
        return spellingChecker_byType;
    }

    public void setSpellingChecker_byType(SpellingChecker_ByType spellingChecker_byType) {
        this.spellingChecker_byType = spellingChecker_byType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkSpelling() {
        spellingChecker_byType.checkSpelling();
    }
}
