班级：计G202  
学号：2020322089  
姓名：石琬竹

# Java-2
Java实验项目

# 阅读程序  

## 一、实验目的
1.理解 Java 语言是如何体现面向对象编程基本思想的；

2.掌握类的声明以及对象的创建；

3.了解类的成员变量和成员方法的特性以及类的构造方法的使用。

## 二、实验过程  
1.打开eclipse 创建Java项目Test2

2.在Java项目中 创建4个包分别为a，b，c，d

3.在a包中创建PC类，b包中创建CPU类，在c包中创建HardDisk类，在d包中创建Test类

4.在CPU类中添加getSpeed()返回speed的值，添加setSpeed(int m)方法将参数m的值赋值给speed；

5.在HardDisk类中添加getAmount()返回amount的值，添加setAmount(int m)方法将参数m的值赋值给amount;

6.在PC类中添加setCPU(CPU c)将参数c的值赋值给cpu，添加setHardDisk(HardDisk h)方法将参数h的值赋值给HD；

7.添加show()方法能显示cpu的速度和字节及硬盘的容量和质量；  

8.在主类Test的main方法中创建一个CPU对象cpu，将cpu自己的speed设置为2200；创建一个HardDisk对象disk，将disk自己的amount设置为200；创建一个PC对象pc；

9.在主类Test的main方法中用pc调用setCPU(CPU c)方法，调用实参是cpu;调用setHardDisk(HardDisk h)方法，调用时实参是disk；调用show()方法。

## 三、核心方法  
1.方法一
```
public void  setSpeed(int m){
		this.speed=m;
	}
```
2.方法二
```
public void  setzLong(int l){
		this.zlong=l;
	}
```
3.方法三
```
public void setAmount(int m){
		this.amount=m;
	}
```
4.方法四
```
public void setWeight(float w){
		this.weight=w;
	}

```
5.方法五
```
public void setHardDisk(HardDisk h){
	this.HD=h;
}
```
6.方法六
```
public void show(){
	System.out.println("CPU速度为"+cpu.getSpeed());
	System.out.println("CPU字长为"+cpu.getzLong());
	System.out.println("硬盘容量为"+HD.getAmount());
	System.out.println("硬盘重量为"+HD.getWeight());
}
```

## 四、实验结果  
```
CPU速度为2200
CPU字长为8
硬盘容量为200
硬盘重量为50.0
```

## 五、实验感想  
通过本次实验，使我收获很大，受益匪浅。可以简单了解 Java 语言是如何体现面向对象编程基本思想的，在这过程中还要感谢同学和的老师帮助，同时也让发现了自己对知识掌握不够，未来要继续努力学习。

