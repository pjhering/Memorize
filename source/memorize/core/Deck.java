package memorize.core;

import java.util.ArrayList;
import java.util.List;

public class Deck
{
    private String title;
    private String author;
    private List<Unit> units;

    public Deck ()
    {
        this.units = new ArrayList<> ();
    }

    public Deck (String title, String author)
    {
        this ();

        this.title = title;
        this.author = author;
    }

    public void add (Unit unit)
    {
        this.units.add (unit);
    }

    public String getTitle () { return this.title; }
    public void setTitle (String value) { this.title = value; }

    public String getAuthor () { return this.author; }
    public void setAuthor (String value) { this.author = value; }

    public List<Unit> getUnits () { return this.units; }
    public void setUnits (List<Unit> value) { this.units = value; }
}
