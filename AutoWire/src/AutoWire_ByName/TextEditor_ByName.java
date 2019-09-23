package AutoWire_ByName;

public class TextEditor_ByName {
    private SpellingChecker_ByName spellingCheckerByName;
    private String name;

    public SpellingChecker_ByName getSpellingCheckerByName() {
        return spellingCheckerByName;
    }

    public void setSpellingCheckerByName(SpellingChecker_ByName spellingCheckerByName) {
        this.spellingCheckerByName = spellingCheckerByName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkSpelling() {
        spellingCheckerByName.checkSpelling();
    }
}
