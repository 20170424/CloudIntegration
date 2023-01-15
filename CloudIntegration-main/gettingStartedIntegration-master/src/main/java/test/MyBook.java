package test;

public class MyBook
{
	private String name;
	private String author;
	private String type;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MyBook [name=" + name + ", author=" + author + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
