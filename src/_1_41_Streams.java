import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import io.netty.handler.codec.spdy.SpdyHttpHeaders.Names;

public class _1_41_Streams
{
	// rahul shetty video - 113
	// termical operation - limit, count, 

	//@Test
	public void regular()
	{
		
		ArrayList<String> new_list = new ArrayList<String>();
		new_list.add("Ankit");
		new_list.add("Praveen");
		new_list.add("Anoop");
		new_list.add("Achin");
		new_list.add("Sagar");
		int count=0;
		
		for(int i=0; i<new_list.size();i++)
		{
			String str= new_list.get(i);
			if(str.contains("A"))
			{
				count++;
				
			}
		}
		
		System.out.println("Name starting with 'A' is - "  + count);
	}

	// stream is nothing but a collection of strings	
	//@Test
	public void stream_filter()
	{
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ankit");
		names.add("Praveen");
		names.add("Anoop");
		names.add("Achin");
		names.add("Sagar");
		
		Long c = names.stream().filter(S->S.startsWith("A")).count();
		System.out.println("Name starting with 'A' is - "  + c);
		
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if intermediate operation i.e. "filter" here, will return "true"
		
		Stream.of("Mohit", "Ankit", " Ramandeep", "Gaurav");
		
		// to print all the names having length greater than 4
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}	
	
	@Test
	public void stream_map()
	{
		// print names of length>4 which ends with "a" and with upper case
		Stream.of("Mohit", "Ankita", " Ramandeep", "Gaurava").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		// print names which have first letter as "a" with uppercase and sorted manner
		
		Stream
		
		
		
	}	
}
