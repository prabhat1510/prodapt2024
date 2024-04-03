package classworkdayeleven.mapexample;

public class Address {
	private Integer addressId;
	private String houseNo;
	private String street;
	private String state;
	private String city;
	private String country;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(Integer addressId, String houseNo, String street, String state, String city, String country) {
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", street=" + street + ", state=" + state
				+ ", city=" + city + ", country=" + country + "]";
	}
	
	
}
