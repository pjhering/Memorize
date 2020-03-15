package memorize.tests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.lang.reflect.Method;
import memorize.core.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String[] tests = {
            "test_io", "test_data"
        };

        for (String s : tests) execute (s);
    }

    private static void execute (String method)
    {
        System.out.print (method);
        System.out.print (": ");

        try
        {
            Method m = Main.class.getMethod (method, new Class[0]);
            Boolean b = (Boolean) m.invoke (null, new Object[0]);

            System.out.println (b ? "passed" : "failed");
        }
        catch (Exception ex)
        {
            System.out.print (ex.getClass ().getName ());
            System.out.print (" - ");
            System.out.println (ex.getMessage ());
        }
    }

    public static boolean test_io () throws IOException
    {
        Unit u1 = new Unit ("Unit One");
        u1.add (new Card ("t0", "sd0", "ld0"));
        u1.add (new Card ("t1", "sd1", "ld1"));
        u1.add (new Card ("t2", "sd2", "ld2"));
        u1.add (new Card ("t3", "sd3", "ld3"));
        u1.add (new Card ("t4", "sd4", "ld4"));
        u1.add (new Card ("t5", "sd5", "ld5"));
        u1.add (new Card ("t6", "sd6", "ld6"));
        u1.add (new Card ("t7", "sd7", "ld7"));
        u1.add (new Card ("t8", "sd8", "ld8"));
        u1.add (new Card ("t9", "sd9", "ld9"));
        Unit u2 = new Unit ("Unit Two");
        u2.add (new Card ("t10", "sd10", "ld10"));
        u2.add (new Card ("t11", "sd11", "ld11"));
        u2.add (new Card ("t12", "sd12", "ld12"));
        u2.add (new Card ("t13", "sd13", "ld13"));
        u2.add (new Card ("t14", "sd14", "ld14"));
        u2.add (new Card ("t15", "sd15", "ld15"));
        u2.add (new Card ("t16", "sd16", "ld16"));
        u2.add (new Card ("t17", "sd17", "ld17"));
        u2.add (new Card ("t18", "sd18", "ld18"));
        u2.add (new Card ("t19", "sd19", "ld19"));
        Deck d1 = new Deck ("Test Deck", "Mr. Deck Tester");
        d1.add (u1);
        d1.add (u2);

        Gson gson = new GsonBuilder ()
            .setPrettyPrinting ()
            .create ();
        String file = "tests.json";
        IO.write (d1, file);
        Deck d2 = IO.read (file);

        String json1 = gson.toJson (d1);
        String json2 = gson.toJson (d2);

        return json1.equals (json2);
    }

    public static boolean test_data ()
    {
        return false;
    }
}
