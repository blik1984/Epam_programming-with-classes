package by.epam.java.classes.simplest_classes_8;

public class Customer {

	private static int counter;
	private int id;
	private String name;
	private String lastName;
	private String patronymic;
	private String address;
	private long cardNumber;
	private long bankAccountNumber;
	
	public Customer () {
		counter++;
		this.id = counter;
	}
	
	public Customer (String lastName, String name,  String patronymic, String address, long cardNumber, long bankAccountNumber) {
		
		counter++;
		this.name = name;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankAccountNumber = bankAccountNumber;
		this.id = counter;

	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public  int getId() {
		return id;
	}

	@Override
	public String toString() {
		return System.lineSeparator() + "Customer [id=" + id + ", lastName=" + lastName + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", cardNumber=" + cardNumber + ", bankAccountNumber=" + bankAccountNumber
				+ "]" ;
	}
}
