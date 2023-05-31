package AugastWrritenTest;

//16)Consider MyConnectionclass contains Mystatement d. 
//Write code such that only one MyConnection and one Mystatementobject is created at all times. 
//No external class can create multiple objects of MyConnection & it'sMyStatement

class Myconnections {
	private static MyConnection instance;
	private Mystatement statement;

	private MyConnection() {
        // Private constructor to prevent external instantiation
        statement = new Mystatement();
    }
}

public class Problem16 {

	public static void main(String[] args) {

	}

}
