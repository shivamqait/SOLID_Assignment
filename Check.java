package shipmentManagement;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"Apple", "Orange"};
		double[] pr = {50, 60};
		int[] q = {2, 3};
		Item[] i = new Item[2];
		for(int j = 0; j < 2; j++)
		{
			i[j] = new Item();
			i[j].setName(name[j]);
			i[j].setPrice(pr[j]);
			i[j].setQty(q[j]);
		}
		
		CheckOut c = new CheckOut(i);
	}

}
