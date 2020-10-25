package 实验二;

public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu){
	this.cpu=cpu;
	}
	void setHardDisk(HardDisk HD){
	this.HD=HD;
	}
	void show(){
	System.out.println("CPU速度："+cpu.getSpeed());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
