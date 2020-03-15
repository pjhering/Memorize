package memorize.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Unit
{
    private String title;
    private Date lastViewOn;
    private List<Card> cards;

    public Unit ()
    {
        this.cards = new ArrayList<> ();
    }

    public Unit (String title)
    {
        this ();

        this.title = title;
    }

    public void add (Card card)
    {
        this.cards.add (card);
    }

    public String getTitle () { return this.title; }
    public void setTitle (String value) { this.title = value; }

    public Date getLastViewOn () { return this.lastViewOn; }
    public void setLastViewOn (Date value) { this.lastViewOn = value; }

    public List<Card> getCards () { return this.cards; }
    public void getCards (List<Card> value) { this.cards = value; }
}
