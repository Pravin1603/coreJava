//Write a simple java program to find out names of students who has score less then 35 without user input.
package Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentScore 
{
	public static void main(String args[])
	{
		//List<String> stdScore = new ArrayList<>();

		Map<String , Integer> stdMap = new HashMap<String , Integer>();
		stdMap.put("Ram",70);
		stdMap.put("Sham",34);
		stdMap.put("Ravi",60);
		stdMap.put("Avi",30);

		for(Map.Entry<String , Integer> entry:stdMap.entrySet())
		{
			String name=entry.getKey();
			int score=entry.getValue();

			if(score <=35)
			{
				System.out.println(name + " Has a score less then 35 and the score of "+ name + " is "+ score);

			}
		}
	}
}
