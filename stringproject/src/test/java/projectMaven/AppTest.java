package projectMaven;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;


import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void inputWordString()
    {
        App p =new App();
        ArrayList<String> inputwords =new ArrayList<String>();
        inputwords.add("Shikha");
        inputwords.add("Apoorva");
        inputwords.add("Apple");
        inputwords.add("Mummy");
        ArrayList<String> outputwords=new ArrayList<String>();  
        outputwords.add("Apoorva");
        outputwords.add("Apple");
        outputwords.add("Mummy");
        ArrayList<String> actualwords= new ArrayList<String>();
        actualwords=p.matchLettersInWord(inputwords);
        assertEquals("Test case failed",outputwords, actualwords);

    }
}
