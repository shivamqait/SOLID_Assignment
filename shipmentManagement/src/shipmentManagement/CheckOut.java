package shipmentManagement;

public class CheckOut {

	public int sum = 0,s;
	public CheckOut() {}
	public CheckOut(Item[] arr){
		
	System.out.println("Product Name\t|\tProduct Price\t|\tProduct Quantity");
		for(int i = 0; i < arr.length; i++)
			{
				System.out.println(arr[i].getName() + "\t\t\t" + arr[i].getPrice() + "\t\t\t" + arr[i].getQty());
				
				sum += arr[i].getPrice() * arr[i].getQty();
			}
				System.out.println("\nTotal : " + sum);

			
	}
	public int total() {
		System.out.println("\nTotal : " + sum);

		return sum;
	}
	
	

}
