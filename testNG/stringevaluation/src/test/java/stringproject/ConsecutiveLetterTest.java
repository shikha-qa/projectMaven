package stringproject;


import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;



/**
 * Unit test for simple App.
 */
public class ConsecutiveLetterTest {
    
    @Test(priority=1) 
    public void inputWordString()
    {
        ConsecutiveLetter cl =new ConsecutiveLetter();
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
        actualwords=cl.matchLettersInWord(inputwords);
        Assert.assertEquals(outputwords, actualwords,"Test case failed");

    }
    @Test(priority=2) 
    public void inputBlank()
    {
        ConsecutiveLetter cl =new ConsecutiveLetter();
        ArrayList<String> inputwords =new ArrayList<String>();
        inputwords.add("");
        cl.matchLettersInWord(inputwords);
        ArrayList<String> outputwords=new ArrayList<String>(); 
        outputwords.add("blank Input no words found");
        ArrayList<String> actualwords =cl.matchLettersInWord(inputwords);
        Assert.assertEquals(actualwords, outputwords,"BUG BUG");


    }
}
