package stringproject;
import java.util.*;  

public class ConsecutiveLetter {
    public  ArrayList<String> matchLettersInWord( ArrayList<String> al )
    {
        
       ArrayList<String> actual= new ArrayList<String>();
       if(al.isEmpty())
       {
        actual.add("blank Input no words found");
        return actual;
        }
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


