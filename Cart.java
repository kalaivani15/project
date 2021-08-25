package project;
import java.util.*;


public class Cart {

	

			public static void main(String[] args) {
				List<Product> products=new ArrayList<Product>();
				List<Product> buy=new ArrayList<Product>();
				Scanner k=new Scanner(System.in);
				int n,t=0;
				boolean flag=false;
				do {
					System.out.println("1.Add Product\n2.Remove Product\n3.List Product\n4.Buy Product\n5.Exit");
					n=k.nextInt();
					switch(n) {
					case 1:
						Product pr=new Product();
						System.out.println("Enter a Product ID");
						pr.setPro_id(k.nextInt());
						System.out.println("Enter a Product Name");
						pr.setPro_name(k.next());
						System.out.println("Enter a Product Price");
						pr.setPro_price(k.nextInt());
						products.add(pr);				
						break;
					case 2:
						System.out.println("Available Products in Stock");
						for(Product p:products) {
							System.out.println(p.pro_id+"-----"+p.pro_name+"-----"+p.pro_price);
						}
						System.out.println("Enter the Product ID to Remove");
						int n1=k.nextInt();
						for(Product p:products) {
							if(p.pro_id==n1) {
								flag=true;
								n1=products.indexOf(p);
								break;
							}
						}
						if(flag) {
							products.remove(n1);
							flag=false;
						}
						break;
						
					case 3:
						System.out.println("Available Products in Stock");
						for(Product p:products) {
							System.out.println(p.pro_id+"-----"+p.pro_name+"-----"+p.pro_price);
						}
						break;
					case 4:
						System.out.println("Available Products in Stock");
						for(Product p:products) {
							System.out.println(p.pro_id+"-----"+p.pro_name+"-----"+p.pro_price);
						}
						System.out.println("How many Product You Want");
						int count=k.nextInt();
						for(int i=1;i<=count;i++) {
							System.out.println("Choose Your "+ i +" Product ID You Want");
							int n2=k.nextInt();
							for(Product p:products) {
								if(p.pro_id==n2) {
									flag=true;
									n2=products.indexOf(p);
									break;
								}
							}
							if(flag) {
								buy.add(products.get(n2));
								for(Product p1:buy) {
									System.out.println(p1.pro_id+"-----"+p1.pro_name+"-----"+p1.pro_price );
									t+=p1.pro_price;
									System.out.println("Total Amount of Products is"+t);
								}
								flag=false;
							}
							}
							break;
											
					}				
						
				}while(n!=5);

			

	



	}

}
