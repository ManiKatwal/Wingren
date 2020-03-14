/**
 * 
 */
package MyThread;

class MyClass extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value is ==> " + i);
		}
	}	
}

/**
 * @author Aadityaa108
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.start();
	}

}
