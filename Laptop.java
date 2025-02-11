public class Laptop{
public static void main(String args[]){
System.out.println("Local variable");
String laptopName="Dell";
double price=25999.23;
byte noOfLaptop=5;
long contactNumber=9876543210L;
System.out.println("Info of Laptop");
System.out.println("Laptop Name:"+laptopName);
System.out.println("Price:"+price);
System.out.println("No of Laptop:"+noOfLaptop);
System.out.println("Contact Number:"+contactNumber);
double total_price=price*noOfLaptop;
System.out.println("Total price is:"+total_price);
// add the GST ->0.18
float gst=0.18F;
double gstAmount=total_price*gst;
System.out.println("GST is:"+gstAmount);
}
}