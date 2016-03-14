import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<Team> teams = new ArrayList<Team>();
		try {
			Scanner input = new Scanner(System.in);
			
			File file = new File("ncaa_data_2016.csv");  
			
			input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				data.add(line);
			}
			for (int i = 1; i < 65; i++ ) {
				String meep = (data.get(i));
				String[] help = meep.split("");
				for (int j = 0; j < 1; j++) {
				 Team meeeep = new Team(Integer.parseInt(help[0]), help[1], Integer.parseInt( help[2]));
				  teams.add(meeeep);
				  
					}
			   }
			
			
			
			input.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	
	
	}
}
