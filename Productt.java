import java.util.scanner
class Product
{
	int pcode,price;
	string name;
	product(int code,string name,int pr)
	{
		pcode=code;
		pname=name;
		price=pr;
	}
}
class Productt
{
	public static void main(string args[]_
	{
		Product product1=new Product(1001,"crayons",45);
		int pcode,price;
		string pname;
		pcode=1002;
		pname="sketch pen"
		price=30;
		Product product2=new Product(pcode,pname,price);
		Scanner sc=new scanner(system.in);
		System.out.println("Enter product code:");
		pcode=sc.nextInt();
		System.out.println("Enter product namee:");
		pname=sc.next();
		System.out.println("Enter product price:");
		price=sc.nextInt();
		Product product3= new Product(pcode,pname,price);
		System.out.println("\npcode:"+product1.pcode);
		System.out.println("\npname:"+product1.pname);
		System.out.println("\nprice:"+product1.price);
		System.out.println("\npcode:"+product2.pcode);
		System.out.println("\npname:"+product2.pname);
		System.out.println("\nprice:"+product2.price);
		System.out.println("\npcode:"+product3.pcode);
		System.out.println("\npname:"+product3.pname);
		System.out.println("\nprice:"+product3.price);
		System.out.println("\n Product having lowest price is:");
		if(product1.price < product2.price && product1.price < product3.price)
		{
			System.out.println("pcode:"+ product1.price);
			System.out.println("pname:"+product1.pname);
			System.out.println("price:"+product1.price);
		}
		else if(product2.price < product1.price && product2.price < product3.price)
		{
			System.out.println("pcode:"+product2.pcode);
			System.out.println("pname:"+product2.pname);
			System.out.println("price:"+product2.price);
		}
		else
		{
			System.out.println("pcode:"+product3.pcode);
			System.out.println("pname:"+product3.pname);
			System.out.println("price:"+product3.price);
		}
	}
}
