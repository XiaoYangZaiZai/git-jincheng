
package factory.ityang.factorysimple;

/**
 * 客户端
 */
public class Client {
	public static void main(String args[]) {
		Chart line = Factory.getInstance("Line");
		if(line!=null)
		line.display();
	}
}
