package java17features.recordclasses;

public class DataDemo {

	public static void main(String[] args) {
		Data data = new Data(11,10);
		
		System.out.println(data.getX());
		System.out.println(data.getY());
		System.out.println("************************************");
		DataRecord dataRecord = new DataRecord(15,10);
		System.out.println(dataRecord.x());
		System.out.println(dataRecord.y());
		
	}

}
