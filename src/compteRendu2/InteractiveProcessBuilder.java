package compteRendu2;

import java.io.IOException;
import java.lang.ProcessBuilder;

public class InteractiveProcessBuilder {

public static void main(String[] args)
{
	Liste<String> commands = new ArrayList<>();
	commands.add("ping");
	System.out.println("entrez un parametre ")
	
	BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	String parameter =reader.readLine();
	commands.readLine();
	commands.add(parameter);
	}
		
	}catch(IOException e)
	{
		e.printStackTracer();
	}
	try {
		
	}
	
}
