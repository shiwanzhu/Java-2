package d;

import a.PC;
import b.CPU;
import c.HardDisk;

public class Test {
	public static void main(String args[]){
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		cpu.setSpeed(2200);
		cpu.setzLong(8);
		disk.setAmount(200);
		disk.setWeight(50);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
