package buddy;
import buddy.services.*;
public class MainApp {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		
		System.out.println("sum = "+ref.add(3, 4));
		System.out.println("sub = "+ref.sub(22.1f,33.1f));
	}

}

