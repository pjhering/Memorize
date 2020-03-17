package memorize.core;

import java.util.Date;

public class Card
{
    public static final long ONE_DAY = 86_400_000L;
    public static final long TWO_DAYS = ONE_DAY * 2;
    public static final long FOUR_DAYS = TWO_DAYS * 2;
    public static final long EIGHT_DAYS = FOUR_DAYS * 2;
    public static final long SIXTEEN_DAYS = EIGHT_DAYS * 2;
    public static final long THIRTYTWO_DAYS = SIXTEEN_DAYS * 2;
    public static final long SIXTYFOUR_DAYS = THIRTYTWO_DAYS * 2;
    public static final long ONEHUNDREDTWENTYEIGHT_DAYS = SIXTYFOUR_DAYS * 2;

    private String term;
    private String shortDefinition;
    private String longDefinition;
    private int consecutiveCorrectResponses;
    private int totalResponses;
    private int daysUntilReview;
    private Date reviewDate;

    public Card ()
    {
        this.consecutiveCorrectResponses = 0;
        this.totalResponses = 0;
        this.daysUntilReview = -1;
        this.reviewDate = new Date (0L);
    }

    public Card (String term, String shortDef, String longDef)
    {
        this ();

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

    public int getConsecutiveCorrectResponses () { return this.consecutiveCorrectResponses; }
    public void setConsecutiveCorrectResponses (int value) { this.consecutiveCorrectResponses = value; }

    public int getTotalResponses () { return this.totalResponses; }
    public void setTotalResponses (int value) { this.totalResponses = value; }

    public int getDaysUntilReview () { return this.daysUntilReview; }
    public void setDaysUntilReview (int value) { this.daysUntilReview = value; }

    public Date getReviewDate () { return this.reviewDate; }
    public void setReviewDate (Date value) { this.reviewDate = value; }
}
