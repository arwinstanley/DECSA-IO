/*
 * @author WinstanleyA
 * @Date 9/26/17
 * This class is just for holding values and doing computations
 */
public class DivHolder {
	private int startIdx;
	private int endIdx;
	private String content;
	private static String noun = "no word provided";
	private static String verb = "no word provided";
	private static String adj = "no word provided";
	/*
	 * @author WinstanleyA
     * @Date 9/26/17
	 * @param none
	 */
public DivHolder() {	
	startIdx = -1;
	endIdx = -1;
	content ="null";
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @param startindex is the index of <
 * @param endindex is the index of >
 * @param info is the word inside <>
 */
public DivHolder(int startindex, int endindex, String info) {
	startIdx = startindex;
	endIdx = endindex;
	if(info.equals("noun"))
	content = noun;
	else if(info.equals("verb"))
	content = verb;
	else if(info.equals("adjective"))
	content = adj;
	else
	content = "please add " + info + " to the static fields";
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @param original is the String you wish to modify
 * @return output is the modified version that has replaced all <> with one of the three
 * word choices
 */
public String replace(String original) {
	String output = "";
	output+=original.substring(0, startIdx);
	output+=content;
	output+=original.substring(endIdx+1);
	return output;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @return startIdx the private variable startIdx
 */
public int getStartIdx() {
	return startIdx;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @return endIdx the private variable endIdx
 */
public int getEndIdx() {
	return endIdx;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @return content the private variable content
 */
public String getContent() {
	return content;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @return noun the private variable noun
 */
public String getNoun() {
	return noun;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @return verb the private variable verb
 */
public String getVerb() {
	return verb;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @return adj the private variable adj
 */
public String getAdj() {
	return adj;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @param in the word you want to set verb equal to 
 */
public void setVerb(String in) {
	verb= in;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @param in the word you want to set verb noun to 
 */
public void setNoun(String in) {
	noun= in;
}
/* 
 * @author WinstanleyA
 * @Date 9/26/17
 * @param in the word you want to set adj equal to 
 */
public void setAdj(String in) {
	adj= in;
}
}
