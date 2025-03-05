import java.util.Scanner;
class Cpu
{
	int price;
	class Processor
	{
		String no_of_cores,manufacturer;
		void display()
		{
			System.out.println("processor manufacturer:" +manufacturer);
			System.out.println("no of cores of processor:" +no_of_cores);
		}
	}
	static class Ram
	{
		int memory;
		String manufacturer;
		void display()
		{
			System.out.println("Ram memory:" +memory);
			System.out.println("Ram manufacturer:"+manufacturer);
		}
	}
	void display()
		{
			System.out.print("price:"+price);
		}
}
public class Cpuinfo
{
  public static void main(String args[])
  {
	  Cpu ncpu=new Cpu();
	  Cpu.Processor processor=ncpu.new Processor();
	  Cpu.Ram ram=new Cpu.Ram();
	  Scanner sc =new Scanner(System.in);
	  System.out.println("enter the processor manufacturer:");
	  processor.manufacturer=sc.next();
	  System.out.println("enter no of cores of processor:");
	  processor.no_of_cores=sc.next();
	  System.out.println("enter the RAM memory size:");
	  ram.memory=sc.nextInt();
	  System.out.println("enter the RAM manufacturer:");
	  ram.manufacturer=sc.next();
	  System.out.println("enter the price:");
	  ncpu.price=sc.nextInt();
	  System.out.println("\n Information of processor and Ram:");
	  processor.display();
	  ram.display();
	  ncpu.display();
	}
}
		
