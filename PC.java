package a;

import b.CPU;
import c.HardDisk;

public class PC {
	CPU cpu;
	HardDisk HD;
	public void setCPU(CPU c){
	this.cpu=c;
}
public void setHardDisk(HardDisk h){
	this.HD=h;
}
public void show(){
	System.out.println("CPU速度为"+cpu.getSpeed());
	System.out.println("CPU字长为"+cpu.getzLong());
	System.out.println("硬盘容量为"+HD.getAmount());
	System.out.println("硬盘重量为"+HD.getWeight());
}
}
