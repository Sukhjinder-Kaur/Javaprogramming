package exercise01;

public class Singers {
	//define instance members
	private int singerId;
	private String name;
	private String address;
	private String dateOfBirth;
	private int numberOfAlbumsPublished;
	
	//define constructors
	public Singers()
	{}
	//including the Overloaded
	public Singers(int singerId)
	{
		this.singerId=singerId;
	}
	
	public Singers(int singerId,String name)
	{   
		this.singerId=singerId;
		this.name=name;
	}
	public Singers(int singerId, String name,String address)
	{
		this.singerId=singerId;
		this.name=name;
		this.address=address;
	}
	
	public Singers(int singerId, String name,String address,String dateOfBirth)
	{
		this.singerId=singerId;
		this.name=name;
		this.address=address;
		this.dateOfBirth=dateOfBirth;
	}
	
	public Singers(int singerId, String name,String address,String dateOfBirth,int numberOfAlbumsPublished)
	{	this.singerId=singerId;
		this.name=name;
		this.address=address;
		this.dateOfBirth=dateOfBirth;
		this.numberOfAlbumsPublished=numberOfAlbumsPublished;
	}
	
	//define getters
	public int getSingerId() {
		return singerId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public int getNumberOfAlbumsPublished() {
		return numberOfAlbumsPublished;
	}
	
	//define setters
	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
		this.numberOfAlbumsPublished = numberOfAlbumsPublished;
	}
	//@Override
	//public String toString() {
	//return  "SingerId= " + singerId + "\n"+
	//			 "Name= " + name + "\n"+
	//			 "Address= " + address + "\n"+
	//			 "Date Of Birth= "+ dateOfBirth +"\n"+
	//			 "Number Of Albums= " + numberOfAlbumsPublished +"\n";
	//}
}//end of the class