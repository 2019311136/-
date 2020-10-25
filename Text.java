package สตั้ถþ;

public class Text {
	public static void main(String args[]){
		CPU cpu=new CPU();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(2200);
		HD.setAmount(200);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
		}
		// TODO Auto-generated method stub

	}


