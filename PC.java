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
	System.out.println("CPU�ٶ�Ϊ"+cpu.getSpeed());
	System.out.println("CPU�ֳ�Ϊ"+cpu.getzLong());
	System.out.println("Ӳ������Ϊ"+HD.getAmount());
	System.out.println("Ӳ������Ϊ"+HD.getWeight());
}
}
