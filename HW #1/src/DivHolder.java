
public class DivHolder {
	private int startIdx;
	private int endIdx;
	private int lineNmr;
	private String content;
	
public DivHolder(int startindex, int endindex,int linenumber, String info) {
	startIdx = startindex;
	endIdx = endindex;
	lineNmr = linenumber;
	content = info;
	
}
public int getStartIdx() {
	return startIdx;
}
public int getEndIdx() {
	return endIdx;
}
public int getlineNmr() {
	return lineNmr;
}
public String getContent() {
	return content;
}
}
