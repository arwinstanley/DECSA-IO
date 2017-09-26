/* 
 * @author WinstanleyA
 * @Date 9/26/17
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class IOMain {
	/* 
	 * @author WinstanleyA
	 * @Date 9/26/17
	 * @param fNme the name of the file your writing to
	 * @return input a PrintWriter which will be able to write to the file given in fNme
	 */
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
	/* 
	 * @author WinstanleyA
	 * @Date 9/26/17
	 * @param fNme the name of the file you wish to read
	 * @return input a Scanner to read the file you gave as input
	 */
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
		/* 
		 * @author WinstanleyA
		 * @Date 9/26/17
		 * @param input is the scanner of the file you want to check if braces are balanced
		 * @param output is the print writer you want to output the answer to
		 */
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
					if(counts<0) {
						output.println("Braces Not Balanced");
						return;
					}
				}
			}
			if (counts==0)
				output.println("Braces Balanced");
			else
				output.println("Braces Not Balanced");
			output.println("");
		}
		/* 
		 * @author WinstanleyA
		 * @Date 9/26/17
		 * @param input is the Scanner of the first file you want to compare
		 * @param input2 is the Scanner of the Second file you want to compare
		 * @param output is the print writer of the file you wish to send the answer to
		 */
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
		/* 
		 * @author WinstanleyA
		 * @Date 9/26/17
		 * @param input is the Scanner of the story you want to replace all the <> with words
		 * @param output is the print writer of the file you want to print your revised story to
		 */
		public static void revision(Scanner input, PrintWriter output) {
			while(input.hasNextLine()) {
				String tester = input.nextLine();
				while(tester.indexOf("<")!=-1 ){
				DivHolder newLine = new DivHolder(tester.indexOf("<"),tester.indexOf(">"),
						tester.substring(tester.indexOf("<")+1, tester.indexOf(">")));
					tester = newLine.replace(tester);	
			  }
				output.println(tester);
			}

		}
		/* 
		 * @author WinstanleyA
		 * @Date 9/26/17
		 * @param args is the names of all the files you want to use in this program
		 */
		public static void main(String[] args) {
			ArrayList<String> word = new ArrayList<String>();
			Scanner sc = new Scanner(System.in);
			System.out.println("please input an noun");
			word.add(sc.next());
			System.out.println("please input an adjective");
			word.add(sc.next());
			System.out.println("please input a verb");
			word.add(sc.next());
			DivHolder control = new DivHolder();
			control.setNoun(word.get(0));
			control.setAdj(word.get(1));
			control.setVerb(word.get(2)); 
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
			sc.close();
		}

}