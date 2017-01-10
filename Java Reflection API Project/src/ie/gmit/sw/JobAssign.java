package ie.gmit.sw;

//A class to soley assign job numbers but is called in AlgoStrings in order to do so
public class JobAssign {
	private static final long serialVersionUID = 1L;
	private String algo;
	private String String1;
	private String String2;
	private String jobNum;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//Call itself
	public JobAssign(){
		super();
	}
	//Set up to be passed on with strings entered, the algorithm chosen and a jobnumber to assign
	public void Request(String String1, String String2, String algo, String jobNum) {
		this.String1 = String1;
		this.String2 = String2;
		this.algo = algo;
		this.jobNum = jobNum;

	}
	
	
	//Source generated getters and setters
	public String getAlgo() {
		return algo;
	}

	public void setAlgo(String algo) {
		this.algo = algo;
	}

	public String getString1() {
		return String1;
	}

	public void setString1(String string1) {
		String1 = string1;
	}

	public String getString2() {
		return String2;
	}

	public void setString2(String string2) {
		String2 = string2;
	}

	public String getJobNum() {
		return jobNum;
	}

	public void setJobNum(String jobNum) {
		this.jobNum = jobNum;
	}

}
