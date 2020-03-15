package memorize.core;

import java.util.Date;

public class Card
{
    private String term;
    private String shortDefinition;
    private String longDefinition;
    private Date lastViewOn;
    private int correctResponses;
    private int incorrectResponses;

    public Card ()
    {
    }

    public String getTerm () { return this.term; }
    public void setTerm (String value) { this.term = value; }

    public String getShortDefinition () { return this.shortDefinition; }
    public void setShortDefinition (String value) { this.shortDefinition = value; }

    public String getLongDefinition () { return this.longDefinition; }
    public void setLongDefinition (String value) { this.longDefinition = value; }

    public Date getLastViewOn () { return this.lastViewOn; }
    public void setLastViewOn (Date value) { this.lastViewOn = value; }

    public int getCorrectResponses () { return this.correctResponses; }
    public void setCorrectResponses (int value) { this.correctResponses = value; }

    public int getIncorrectResponses () { return this.incorrectResponses; }
    public void setIncorrectResponses (int value) { this.incorrectResponses = value; }
}
