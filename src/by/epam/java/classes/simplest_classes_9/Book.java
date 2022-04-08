package by.epam.java.classes.simplest_classes_9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {

	private static int counter;
	private int id;
	private String bookName;
	private String author;
	private String publishingHouse;
	private int  publishingYear;
	private int numberPages;
	private double price;
	private String binding;
	
	public Book () {
		counter++;
		this.id = counter;
	}
	
	public Book (String bookName, String author, String publishingHouse, int  publishingYear, int numberPages, double price, String binding) {
		counter++;
		this.id = counter;
		this.bookName = bookName;
		this.author = author;
		this.publishingHouse = publishingHouse;
		final Calendar calendar = new GregorianCalendar();
		final int year = calendar.get(Calendar.YEAR);
		if (publishingYear < 868) {
			this.publishingYear = 0;
		} else if (publishingYear > year) {
			this.publishingYear = year;
		} else {
		this.publishingYear = publishingYear;
		}
		this.numberPages = numberPages;
		this.price = price;
		final String s1 = "м€гкий";
		final String s2 = "твердый";
		final String s3 = "твЄрдый";
		final String s4 = "неизвестно";

		if (binding.compareToIgnoreCase(s1) == 0 ||binding.compareToIgnoreCase(s2) == 0 ||binding.compareToIgnoreCase(s3) == 0) {
			this.binding = binding;
		} else {
			this.binding = s4;
		}
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		final Calendar calendar = new GregorianCalendar();
		final int year = calendar.get(Calendar.YEAR);
		if (publishingYear < 868) {
			this.publishingYear = 0;
		} else if (publishingYear > year) {
			this.publishingYear = year;
		} else {
		this.publishingYear = publishingYear;
		}
		System.out.println(year);
	}
	public int getNumberPages() {
		return numberPages;
	}
	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		final String s1 = "м€гкий";
		final String s2 = "твердый";
		final String s3 = "твЄрдый";
		final String s4 = "неизвестно";

		if (binding.compareToIgnoreCase(s1) == 0 ||binding.compareToIgnoreCase(s2) == 0 ||binding.compareToIgnoreCase(s3) == 0) {
			this.binding = binding;
		} else {
			this.binding = s4;
		}
	}
	public static int getCounter() {
		return counter;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return System.lineSeparator() + "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", publishingHouse="
				+ publishingHouse + ", publishingYear=" + publishingYear + ", numberPages=" + numberPages + ", price="
				+ price + ", binding=" + binding + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + id;
		result = prime * result + numberPages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + publishingYear;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (binding == null) {
			if (other.binding != null)
				return false;
		} else if (!binding.equals(other.binding))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		//if (id != other.id)
		//	return false;
		if (numberPages != other.numberPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publishingYear != other.publishingYear)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		return true;
	}
}
