public class Address {
    private String address1;
	private String address2;
	private String postcode;
	private String city;

	public void setaddress1(String address1) {
		this.address1=address1;
	}
	public void setaddress2(String address2) {
		this.address2=address2;
	}
	public void setpostcode(String postcode) {
		this.postcode=postcode;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public String getline1() {
		return address1;
	}
	public String getline2() {
		return address2;
	}
	public String getpostcode() {
		return postcode;
	}
	public String getcity() {
		return city;
	}
}