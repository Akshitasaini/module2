package finallyworks;
public class Main {
static int count=0;
 public static void main (String[] args) {
	 while(true) {
		 try {
			 if (count++ == 0)
				 throw new MyException("exception occured");
		 }
		 catch(Exception e) {
	 System.out.println(e);
	 }
	 finally {
		 System.out.println("in finally clause");
		 if (count==2)
		 break;
	 }
	 
 }

}
}