package memorize.core;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IO
{
    private IO ()
    {
    }

    public static void write (Deck deck, String path) throws IOException
    {
        write (deck, new File (path));
    }

    public static void write (Deck deck, File file) throws IOException
    {
        Gson gson = new Gson ();
        String json = gson.toJson (deck);

        try (FileWriter writer = new FileWriter (file))
        {
            write (deck, writer);
        }
    }

    public static void write (Deck deck, Writer writer) throws IOException
    {
        Gson gson = new Gson ();
        String json = gson.toJson (deck);

        writer.write (json);
        writer.flush ();
    }

    public static Deck read (String path) throws IOException
    {
        return read (new File (path));
    }

    public static Deck read (File file) throws IOException
    {
        return read (new FileReader (file));
    }

    public static Deck read (Reader reader) throws IOException
    {
        StringBuilder builder = new StringBuilder ();

        try (BufferedReader buffer = new BufferedReader (reader))
        {
            String line;

            while ((line = buffer.readLine ()) != null)
            {
                builder.append (line).append ("\n");
            }
        }

        Gson gson = new Gson ();
        return gson.fromJson (builder.toString (), Deck.class);
    }
}
