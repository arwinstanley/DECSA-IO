import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class IOMain {
	
	public static PrintWriter readerW(String fNme) {
		File scannable = new File( fNme );
		PrintWriter input = null;
		try {
			input = new PrintWriter(scannable);
		} catch (FileNotFoundException ex) {
			System.out.println("Cant open file: " + fNme);
			return null;
		}
		return input;
	}
		public static Scanner reader(String fNme) {
		File scannable = new File( fNme );
		Scanner input = null;
		try {
			input = new Scanner(scannable);
		} catch (FileNotFoundException ex) {
			return null;
		}
		return input;
	}
		public static void writeJava (Scanner input, PrintWriter output) {
			int counts= 0;
			while(input.hasNextLine()) {
				String word = input.nextLine();
				char [] holder= word.toCharArray();
				for(int i=0;i<holder.length;i++) {
					if (holder[i]=='{') 
						counts++;
					if(holder[i]=='}')
						counts--;
				}
			}
			if (counts==0)
				output.println("Braces Balanced");
			else
				output.println("Braces Not Balanced");
			output.println("");
		}
		public static void checkCode(Scanner input, Scanner input2, PrintWriter output) {
			while(input.hasNextLine()) {
				
				String word = input.nextLine();
				
				String word2 = input2.nextLine();
	
				if(!(word.equals(word2))) {
				  output.println("Files not Identical");
				  output.println("");
				return;
				}
			}
			output.println("Files Identical");
			output.println("");
		}
		public static void revision(Scanner input, PrintWriter output) {
			ArrayList<>
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = reader(args[0]);
			Scanner inTooDeep = reader(args[2]);
			Scanner imNotAnAuthor = reader(args[3]);
			PrintWriter out = readerW(args[1]);
			if(in==null) {
				out.println("Part 1: Unable to Open File ");
				System.exit(1);
			}
			if(inTooDeep==null) {
				out.println("Part 2: Unable to Open File ");
				System.exit(1);
				}
			if(imNotAnAuthor==null) {
				out.println("Part 3: Unable to Open File ");
				System.exit(1);
				}
			writeJava(in, out);
			checkCode(in, inTooDeep, out);
			revision(imNotAnAuthor, out);
			in.close();
			out.close();
		}

}