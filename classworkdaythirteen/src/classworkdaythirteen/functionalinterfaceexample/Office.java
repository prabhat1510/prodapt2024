package classworkdaythirteen.functionalinterfaceexample;

public class Office {
	
	private Integer officeId;
	private String block;
	private String buildingName;
	private String area;
	private String city;
	public Integer getOfficeId() {
		return officeId;
	}
	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Office [officeId=" + officeId + ", block=" + block + ", buildingName=" + buildingName + ", area=" + area
				+ ", city=" + city + "]";
	}
	
	
	
}
