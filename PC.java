package ʵ���;

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
	System.out.println("CPU�ٶȣ�"+cpu.getSpeed());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
