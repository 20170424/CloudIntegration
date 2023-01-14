package test;

public class Book {
	
	public String create(String name) {
		System.out.println("----------- create receives: " + name);
		return "Book listed for " + name;
	}

}
