public class LocalTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String ordVer = "01";
		String orderNumber = "56658999";
		String orderId = (orderNumber == null) ? orderNumber : orderNumber.trim()
		
		if(ordVer == null || ordVer.length() <=0)
		{
			if(orderId.trim().length() == 9){
				orderNumber = orderId.substring(0,orderId.length()-1);
				ordVer = orderId.substring(orderId.length()-1);
			}else{
				orderNumber = orderId.substring(0);
			}
		}
		
		System.out.println("Order Number is " + orderNumber);
		System.out.println("Order Version is" + ordVer);

	}
}
