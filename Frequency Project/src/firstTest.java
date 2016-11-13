import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class firstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String num = Integer.toString(sc.nextInt());
		
		
		char numArray[] = num.toCharArray();
		Integer count=0;
		Map<Character,Integer> numMap = new TreeMap<Character,Integer>();
		for(char c : numArray){
			if(numMap.containsKey(c)){
				numMap.put(c,numMap.get(c) +1 ) ;
				
						
			}
			else {
			
				numMap.put(c, 3);
			}
			
			
		}
		
		for(Map.Entry<Character, Integer> entry : numMap.entrySet()){
			
			System.out.println(entry.getKey() + "-->" + entry.getValue() );
			
			
			
		}
		
		

	}

}
