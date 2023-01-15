package test;

public class BookService {
	
	public MyBook myService(MyBook myBook){
		System.out.println(myBook);
		MyBook ma = new MyBook();
		ma.setPrice(myBook.getPrice());
		ma.setName(myBook.getName());
		ma.setAuthor(myBook.getAuthor());
		ma.setType(myBook.getType());
		return ma;
		//myAccount.setAmount(myAccount.getAmount() + 200);
		//return myAccount;
	}

}
