package memorize.core;

public class Card
{
    private String term;
    private String shortDefinition;
    private String longDefinition;
    private int correctResponses;
    private int incorrectResponses;

    public Card ()
    {
    }

    public Card (String term, String shortDef, String longDef)
    {
        this.term = term;
        this.shortDefinition = shortDef;
        this.longDefinition = longDef;
    }

    public String getTerm () { return this.term; }
    public void setTerm (String value) { this.term = value; }

    public String getShortDefinition () { return this.shortDefinition; }
    public void setShortDefinition (String value) { this.shortDefinition = value; }

    public String getLongDefinition () { return this.longDefinition; }
    public void setLongDefinition (String value) { this.longDefinition = value; }

    public int getCorrectResponses () { return this.correctResponses; }
    public void setCorrectResponses (int value) { this.correctResponses = value; }

    public int getIncorrectResponses () { return this.incorrectResponses; }
    public void setIncorrectResponses (int value) { this.incorrectResponses = value; }
}
