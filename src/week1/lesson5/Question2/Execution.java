package week1.lesson5.Question2;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer("Sony", "AMD", 8, 1024, 2.8);
		Notebook n = new Notebook("Acer", "Intel", 4, 500, 1.6, 11.2, 15.3, 1.22);

		System.out.println("Computer's Disk Size: " + c.getDiskSize());
		System.out.println("Computer's Processor Speed: " + c.getProcessorSpeed());
		System.out.println("Computer's RAM size: " + c.getRamSize());
		System.out.println("Computer's Power: " + c.computePower());

		System.out.println("=======================================");

		System.out.println("Notebook's Disk Size: " + n.getDiskSize());
		System.out.println("Notebook's Processor Speed: " + n.getProcessorSpeed());
		System.out.println("Notebook's RAM size: " + n.getRamSize());
		System.out.println("Notebook's Power: " + n.computePower());
		System.out.println("Notebook's Screen Size: " + n.screenSize());

	}
}
