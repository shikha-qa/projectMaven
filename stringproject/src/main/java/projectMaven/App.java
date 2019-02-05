package projectMaven;
import java.util.*;  

public class App 
{
    public  ArrayList<String> matchLettersInWord( ArrayList<String> al )
    {
       ArrayList<String> actual= new ArrayList<String>();
    for(String S:al)
    {
        int j;
        for(j=1;j<S.length();j++)
        {
            if(S.charAt(j) == S.charAt(j-1))
            {
               actual.add(S);
                break;
            }
        }
       
    }
    return actual;
    }
    
}
