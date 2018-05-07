package CallCalcualte;

import Operandsclass.Add;

public class CallCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int opeval1 = 0;
		Add Addoper=new Add();
		opeval1=Addoper.calculate("+", opeval1, opeval1);
		System.out.println(opeval1);
	}

}
