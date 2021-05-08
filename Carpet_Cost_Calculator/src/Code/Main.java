package Code;

public class Main {

	public static void main(String[] args) {
		
			Floor floor=new Floor(30, 50);
			Carpet carpet=new Carpet(8);
			Calculator calculator=new Calculator(floor, carpet);
			
			System.out.println("Total Cost= "+calculator.getTotalCost());

		}

	}


