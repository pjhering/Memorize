package memorize.core;

import java.util.List;

public class Unit
{
    private String title;
    private List<Card> cards;

    public Unit ()
    {
    }

    public String getTitle () { return this.title; }
    public void setTitle (String value) { this.title = value; }

    public List<Card> getCards () { return this.cards; }
    public void getCards (List<Card> value) { this.cards = value; }
}
