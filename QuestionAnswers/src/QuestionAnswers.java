//gabriel Z
//software engineer
import java.util.*;
//quick edit

public	class	QuestionAnswers	{
      /**
          *	Maps	question	to	answer.
          */
          static HashMap<String, String> questionAns = new HashMap<String, String>();


      public static void put(String	question,	String	answer)	{

        questionAns.put(question, answer);

      }
      /**
          *	Queries	if	question	maps	to	answer.
          */


      static boolean	testAnswer(String	question,	String	answer)	{
        if(questionAns.get(question) == answer)
        {
          return true;
        }
        else
        {
        return false;
        }
      }
      /**
          *	Gives	out	a	random	question	from	the	key	set.
          */
      static String getRandomQuestion(){
       Random rand = new Random();
       int randInt = rand.nextInt(5);
     
       Object[] values = questionAns.values().toArray();
       Object randomValue = values[rand.nextInt(values.length)];
       return (String) randomValue;
      }
  }
