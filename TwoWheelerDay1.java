
package week1.day1assignment;


public class TwoWheelerDay1 {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chasisNumber=1L;
	boolean isPunctured=false;
	String bikeName="Royal Enfield";
	double runningKM=10000;
	
	public static void main(String[] args) {
		twoWheeler obj=new twoWheeler();
		System.out.println("My bike has "+obj.noOfWheels+" Wheels");
		System.out.println("My bike has "+obj.noOfMirrors+" Mirrors");
		System.out.println("My bike's chasNumber is:" + obj.chasisNumber);
		System.out.println("My Bike's puncture status is (True/False) : " +obj.isPunctured);
		System.out.println("My Bike's name is "+ obj.bikeName);
		System.out.println("My Bike has covered running KM of "+ obj.runningKM);
	}

}
