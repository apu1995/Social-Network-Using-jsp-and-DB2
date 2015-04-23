package control;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidateInput 
{
    public Boolean isalpha(String parameter)
    {
        return parameter.matches("[A-Za-z ]+");
    }
    
    public Boolean isbeta(String parameter)
    {
        return parameter.matches("[A-Za-z0-9 ]+");
    }
    
    public Boolean isnum(String parameter)
    {
        return parameter.matches("[0-9.]+");
    }
    
    public Boolean istimestamp(String parameter)
    {
        final String DATE_FORMAT = "MM/dd/yyyy HH:mm";

        try 
        {
            DateFormat format = new SimpleDateFormat(DATE_FORMAT);
            format.setLenient(false);
            format.parse(parameter);
            return true;
        }
        catch (ParseException e)
        {
            return false;
        }
        
    }
}

