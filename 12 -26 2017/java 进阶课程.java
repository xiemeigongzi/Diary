MOOC java 进阶课程 Kai Weng
//1  不想看
每个图形都是一个对象；
每个对象都是由它所属的类class
设计一个circle的类， 可以制造很多的circle类的对象

对象 和 类 
对象是实体， 需要被创建，可以做事情 （具体的）
类是规范， 根据类的定义来创建对象 （概括性表达）

对象=属性+服务
数据：属性或状态
操作： 函数 

把数据和对数据的操作放在一个地方： 封装
操作保护内部的数据


// 2  1-2 定义类：
File- new - Java Project  ： vendingmachine (project lowercase)
Class: VendingMachine

package vendingmachine;

public class VendingMachine {
	int price=80;  // 成员
	int balance;  // 成员
	int total;  // 成员
	
	void showPrompt()
	{
		System.out.println("welcome!");
	}
	
	void insertMoney(int amount)
	{
		balance=balance+amount;
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if(balance>=price)
		{
			System.out.println("Here you are");
			balance=balance-price;
			total=total+price;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm=new VendingMachine();
		// 用 new 创造对象 vm
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
	}
}

3个变量 = 3个属性
4个动作 操作 


定义一个类： 用new 运算符 创建对象 vm，
new VendingMachine();
VendingMachine vm=new VendingMachine();
对象变量是对象的管理者
. 运算符

让对象做事情
vm.insertMoney(amount);
VendingMachine vm1=new VendingMachine();
VendingMachine vm2= new VendingMachine();

一个类 可以创建很多的对象  
对象是实体，
vm1 & vm2 是 VendingMachine 同一个类的 两个不同的对象

类： 定义了所有的对象 长什么样
对象： 是类的具体实例


// 3 1-3 成员变量和成员函数
类： 定义了对象中所具有的变量， 这些变量成为  成员变量；
每个对象都有自己的变量， 和同一个类的其他对象是分开的

函数与成员变量：
1）。 在函数中可以直接写 成员变量的名字来访问成员变量
2）。 函数是通过对象来调用的

vm.insertMoney();
这次调用临时建立了一个 insertMoney() 和 vm 之间的关系；
让 insertMoney()内部的成员变量指的是vm 的成员变量

this:
this 是成员函数的一个特殊的固有的本地变量，
它表达了这一次调用这个函数时候的那个对象
如：
	void showBalance()
	{
		System.out.println(this.balance);
	}

	void setPrice(int price )
	{
		this.price=price;
		this.getFood();
	}
	
这里的 this.price 指的是前面的成员变量 int  price=80; 


调用函数：
通过点运算符调用某个对象的函数
在成员函数内部直接调用自己（this）的其他函数
在一个成员函数内部调用另外一个成员函数，不需要用点运算符
如：
void insertMoney(int amount){
	balance=balance+amount;
	showBalance(); // 就可以了 当然 this.showBalance(); 也可以
}


本地变量：
定义在函数内部的变量是 本地变量：
本地变量的生存期和作用域都是在函数内部

成员变量：
成员变量的生存期是对象的生存期，作用域是类内部的成员函数

// 4 1-4 对象初始化
new 创建一个新的对象

成员变量定义初始化
1）。 成员变量在定义的地方就可以给出 初始值；
2）。 没有给出初始值的成员变量会自动获得0值；
3）。 对象变量的0值表示没有管理任何对象，也可以主动给null值；
4）。 定义初始化可以调用函数， 甚至可以使用已经定义的成员变量

Boolean 初始值： false 
对象变量 初始值： null

如：
public class VendingMachine{
	int price =80; // 定义一个成员变量的地方给一个初始值；
	int balance =f(); // 甚至可以使用已经定义的函数；
}

	int f()
	{
		return 10;
	}
	
	VendingMachine（） // 构造函数
	{
		total=0;
	}
	
	
	VendingMachine(int price)
	{
		this.price=price;
	}
	// 这个也可以 但是我也不知道为什么这么做
	
构造函数：
如果有一个成员函数的而名字和类的名字是完全相同的；
则正在创建这个类的每一个对象的时候会自动调用这个函数
调用完这个构造函数以后，还是顺着原来的顺序走一遍成员变量金额成员函数，最后回到构造函数

构造函数： 没有返回类型：

重载关系：根据给出的是什么函数来决定自动调用什么构造函数
VendingMachine（） // 构造函数

	{
		total=0;
	}
	
	
	VendingMachine(int price)
	{
		this(); // 没有参数的构造函数
		// 这个this() 只能在构造函数中出现，
		//并且只能出现在构造函数的第一行，并且只能出现一次
		this.price=price;
	}
	
// 5 1-5 编程题
// 做出两个类
import java.util.Scanner;

public class Main{
	
	public  static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Fraction a =new Fraction(in.nextInt(), in.nextInt());
		Fraction b =new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}


// 6 2-1 对象交互-1： 对象的识别
new project clock 
class : display 

package clock;
// 构造函数：

public class Display {
	private int value=0;
	private int limit=0;
	
	public Display(int limit)
	{
		this.limit=limit;
	}
	
	public void increase() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display(24);
		for(;;)
		{
			d.increase();
			System.out.println(d.getValue());
		}
	}
}

// 7 2-2 对象交互-2 
// 两个类： 如何相互交互？？

package clock;

public class Display {
	private int value=0; // 私有的
	private int limit=0;
	
	public Display(int limit) // 构造函数：
	{
		this.limit=limit;
	}
	
	public void increase() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display(24);
		for(;;)
		{
			d.increase();
			System.out.println(d.getValue());
		}
	}
}

package clock;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void start() {
		while(true) {
		minute.increase();
		if(minute.getValue()==0){
			
			hour.increase();
		}
		System.out.printf("%02d : %02d\n",hour.getValue(), minute.getValue());
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock=new Clock();
		clock.start();
	}
}

// done by myself 

public class Display{
	private int value=0;
	private int limit=0;
	
	public Display(int n){
		limit=n;
	}
	
	public void increase(){
		value++;
		if(value==limit){
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
}

public class DisPlayTest{
	Display hour= new Display(24);
	Display minute= new Display(60);
//	Dispaly second= new Display(60);
	
	
	void getStart(){
		while(true){
		minute.increase();
		if(minute.getValue==0){
			hour.increase()++;
		}
		System.out.printf("%2d : %2d\n",hour.getValue(), minute.getValue());
	}
}
	
	
	public static void main(String[] args){
		DisPlayTest d= new DisPlayTest();
		d.getStart();
	}
}

// + second 

public void getStart(){
	while(true ){
		second.increase();
		if(second.getValue()==0){
			minute.increase();
		
		if(minute.getValue()==0){
				hour.increase();
		}
		}
		System.out.printf("%2d : %2d : %2d\n",hour.getValue(), minute.getValue(),second.getValue());
		}
}
		
	
// 能成功执行的 hour: minute: second 
 class Display{
	private int value=0;
	private int limit=0;
	
	public Display(int n){ // 构造函数
		limit=n;
	}
	
	public void increase(){
		value++;
		if(value==limit){
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
}

 class PlayTest{
	Display hour= new Display(24);
	Display minute= new Display(60);
   Display second= new Display(60);
	
	
	public void getStart(){
while(true ){
		second.increase();
		if(second.getValue()==0){
			minute.increase();
		if(minute.getValue()==0){
				hour.increase();
		}
}
		System.out.printf("%2d : %2d : %2d\n",hour.getValue(), minute.getValue(),second.getValue());
		}
}
     
	public static void main(String[] args){
		PlayTest d= new PlayTest();
        d.getStart();
	}
}
	
// 如果 不用构造函数  怎么处理？？
public class Display{
	private int value=0;
	private int limit=0;
	
	public void increase(){
		value++;
		if(value==limit)
		{
			value=0;
		}
	}
	
	public void getLimit(int n)
	{
		linit=n;
	}
	
	public void getValue(){
		return value;
	}
}

public class DispalyTest{
	Display hour= new Display();
	Dispaly minute= new Display();
	Display second= new Display();
	
	hour.getLimit(24);
	minute.getLimit(60);
	second.getLimit(60);
	
	public void getStart(){
		while(true){
			second.increase();
			if(second.getValue()==0)
			{
				minute.increase();
				if(minute.getValue()==0)
				{
					hour.increase();
				}
			}
			System.out.printf("%2d : %2d : %2d\n",hour.getValue(), minute.getValue(),second.getValue());
		}
	}
	
	public static void main(String[] args){
		DispalyTest d= new DispalyTest();
		d.getStart();
	}
}

//写不出来出现 error： <identifier> expected

Debug：
class Display{
	private int value=0;
	private int limit=0;
	
	public void increase(){
		value++;
		if(value==limit)
		{
			value=0;
		}
	}
	
	public void getLimit(int n)
	{
		limit=n;
	}
	
	public int getValue(){
		return value;
	}
}

public class DispalyTest{
	
	public static void main(String[] args){
	Display hour= new Display();
	Display minute= new Display();
	Display second= new Display();
	hour.getLimit(24);
	minute.getLimit(60);
	second.getLimit(60);
    
		while(true){
			second.increase();
			if(second.getValue()==0)
			{
				minute.increase();
				if(minute.getValue()==0)
				{
					hour.increase();
				}
			}
			System.out.printf("%2d : %2d : %2d\n",hour.getValue(), minute.getValue(),second.getValue());
		}
    }
}
			
这个结果可以了

// 8 2-2 访问属性-1 
对象 类 
封装： 把数据和对数据的操作放在一个地方，通过操作，把数据保护起来
对象=属性+服务
数据： 属性或者状态
操作： 函数  针对对象（or 数据）的操作

手段： 所有的成员 都可以设置 访问属性
private int value=0;
private int limit=0;

value 和 limit 都是成员变量

private: 这个成员是这个类 私有的，只有在这个类的内部才能访问
如：
public int getValue(){
	private int i;
	return value:
}
// 这样是不行的 private关键字 只能用于成员变量 以及 成员函数
// 


private： 只有两个地方可以做访问：
1） 。 成员函数里， 构造函数 访问 private 成员变量， 
2）。 定义初始化的地方，如

private int value =0;
private int limit =value;

private 
只有这个类的内部可以访问：
	类内部指的是： 类的成员函数和定义初始化
	这个限制是对 类的 而不是对 对象的
	
一个类的 所有的 不同的对象之间，可以访问别人的私有成员
私有是针对类 不是针对 对象的


// 9 2-2 访问属性-2 

public：
任何人都可以访问：
	任何人指的是 在任何类的函数或者 定义初始化中 可以使用
	使用指的是  调用， 访问 或 定义变量
	
如果没有在一个成员前面 + public or private 关键字来限制
friendly： 位于同一个package 的其他类 可以访问

protected  继承的时候再学

如：
public class Clock
Clock 这个class类， 是public：

如果一个类是public，那么就 要求：
源代码的文件名 必须和这个类的名字相同

如： 
public class Clock {
...}
这个类的文件名 必须是Clock
不能是 public class Clocks 

编译单元： 编译的时候，一次对这一个编译单元做编译的动作

在一个编译单元里，可以有很多 java 的类 class
当一个编译单元有不止一个类 class 的时候，只有一个类 可以是 public 
如：

class A{
...}

public class Clock{
...}

// 不能是  public class A

class A{
。。。}

这个类 class A 只能在这个 包 里起作用，一旦出了这个包，就不能起作用了


// 10 2-3 包 package

src 底下的clock是一个 package

如果在 clock project 里 新建一个 Package 叫display
src  里 多了一个叫 display的 package 文件夹

Clock.java 的文件中， 出现 import display.Display;
引用另外一个包 package里面的Display这个类，
Clock.java 就把 display 这个包里 Display 这个类拿过来
 
只要你用的类不在一个包里面 就要 import
import.包的名字.类的名字

如果不用 import导入另外一个包里的类，后面就需要：

public class Clock{
	private display.Display hour = new display.Display();
	private display.Display minute = new display.Display();
	
如果 import display.*
= import display 这个包里的所有东西 .*


特殊的 display包的形式：
在 clock 里 新建一个 package， 名字取为： display.led
. 表示文件夹的层次
如：

import java.util.Scanner;



// 11 2-4 类变量-1 
static 


package clock;

public class Display {
	private int value=0; // 私有的
	private int limit=0;
	private static int step =1;
	
	public Display(int limit) // 构造函数：
	{
		this.limit=limit;
	}
	
	public void increase() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display(10);
		Display d2=new Display(20);
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step=2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		
	}
}

OUTPUT:
Finished in 92 ms
1 //d1.value
0 //d2.value
1 //d1.step;
1 //d2.step;
2 //d1.step;
2 //d2.step;


public class Display {
	private int value=0; // 私有的
	private int limit=0;
	private static int step =1;
	
	public Display(int limit) // 构造函数：
	{
		this.limit=limit;
	}
	
	public void increase() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display(10);
		Display d2=new Display(20);
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step=2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		Display.step=3; //Display是类， step 是成员变量
		// 这里没有 对象， 也就是 类.成员变量
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		// 如果有：
		Display.value=3; // 这是不能访问这个value
	}
}
// 也就是说， 只有通过 类.成员变量 才能访问 static 的成员变量 
所以， static 叫做 类变量，不是成员变量，是类的变量，
static 类变量 不属于 这个类中的任何一个对象，static 类变量属于 类 class
所以， 任何对象都拥有这个 类变量  
同时， 类变量 不在 对象中




OUTPUT:
1
0
1
1
2
2
3
3

在 class Display 里设置成员变量：
private static int step =1;


//12 2-4 类变量-2  类函数
类函数 有 static

static 函数 不属于任何对象， 它属于这个类

public class Display {
	private int value=0; // 私有的
	private int limit=0;
	private static int step =1;
	
	public Display(int limit) // 构造函数：
	{
		this.limit=limit;
	}
	
	public void increase() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public static void f(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display(10);
		Display d2=new Display(20);
		d1.increase();
		f();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step=2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		Display.step=3; //Display是类， step 是成员变量
		// 这里没有 对象， 也就是 类.成员变量
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		// 如果有：
		Display.value=3; // 这是不能访问这个value
	}
}


如果有：
	public int getValue(){
		return value;
	}
	
	public static void f(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 可以调用 f（） 函数
		f(); // 因为大家都是 static
		// 不需要通过 对象来调用 static 函数 f();
		// 在static 函数里 可以调用其他的static 函数
		// 也可以：
		d1.f();
	}
	
	如果在public static void f(){
		value++;// 是不行的， 你不能在一个 static 函数里访问一个非static的变量
	}
	
static int step =2;
这个 static 类变量只能初始化一次
比如说：
d1.step=3;
那么所有的 step 都 step=3;



// 13 3-1 顺序容器 记事本 
要求：
1). 能存储记录
2). 不限制能存储的记录的数量
3). 能知道已经存储的记录的苏良
4). 能查看存进去的每一条记录
5). 能删除一条记录
6). 能列出所有的记录

接口设计：
add(String note);
getSize();
getNote(int index);
removeNote(int index);
list();

先创建一个新的project ， 创建一个新的 class： NoteBook
在NoteBook里， 定义各个接口

package notebook;

public class NoteBook {

	public void add(String s)
	{
		
	}
	
	public int getSize() {
		return 0;
	}
	
	public String getNote(int index) {
		return "";
	}
	
	public boolean removNote(int index) {
		return true;
	}
	
	public String[] list() {
		return 

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}


// 14 3-2 顺序容器-2 范型容器类
需要有一个成员变量：

import java.util.ArrayList;
private ArrayList<String> notes= new ArrayList<String>();

引入一个类： 这个类 属于 java. util 包. ArrayList(这个类)
所以 类的名字就是 ArrayList

 ArrayList<String> 
 = ArrayList of String 
用来存放String 类型数据的 class 类ArrayList
这种类叫做： 范型类， 是一种容器
notes 本身 是一个对象管理者


定义一个变量 notes， 类型是 ArrayList 
notes 是对象管理者

容器类： 用来存放对象
ArrayList<String> notes= new ArrayList<String>;

容器类有两种类型：
	容器的类型； 如： ArrayList
	元素的类型； 如： String
	
	
怎么把东西放进去？
public void add(String s){
	notes.add(s); // 或许是 Array List 这个类 自带的 add() 函数？？？
	// ArrayList 里面有个函数叫做add() 并且 add（）函数只接受 string 类型，不接受其他的类型
}

public int getSize(){
	return notes.size();
}


//

package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes= new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public boolean removNote(int index) {
		return true;
	}
	
	public String[] list() {
		return new String[10]; //?

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= new String[2];
		a[0]="first";
		a[1]="second";
		NoteBook nb= new NoteBook();
		nb.add("first");
		nb.add("second");
		System.out.println(nb.getSize());
	}

}



// 15 3-1 顺序容器-3 ArrayList 的操作
ArrayList 是系统内部的一个类
能记录元素， 保持加进去元素的数量
，形成下标索引，因此，可以获取其中一个元素

ArrayList <String> notes= new ArrayList<String>();

public String getNote(int index){
	return notes.get(index);
}

public String getNote(int index) {
		return notes.get(index);// ArrayList 里有 get(int index)的函数
	}

因此， 在main() 中：
	System.out.println(nb.getNote(0));
	

增加一个接口：
	public void add(String s, int location){
		notes.add(location, s);
		// 这个是ArrayList 本身自带的函数 add(int index, String Element)
	}
	
	
再更新一个接口：
public void removNote(int index) {
	 notes.remove(index);
	}
	// 注意： remove（） 函数返回的类型是： string
	// 返回是删掉的东西 所以不用Boolean 
	// 原来的版本是：
	 public boolean removeNote(int index){
		return notes.remove(index);
	}
	// 所以 这个不用 Boolean， 因为出现异常remove()函数自己会有提示的
	// 不用return 任何东西
	
	
	
// 要返回一个数组：数组表达容器中所有的东西
方法1：

	public  String[] list(){
		String [] a= new String[notes.size()];
		for(int i; i<notes.size();i++){
			a[i]=notes.get(i);
		}
		return a;
	}
	
	在 main 里面：
	NoteBook nb= new NoteBook();
	String[] a= nb.list();
	for(String s: a)
	{
		System.out.println(s);
	}
	
方法2：
public  String[] list(){
		String [] a= new String[notes.size()];
		notes.toArray(a);// 把 notes 里面的数组放进 a 中
		return a;
	}
	
	
	同时， main() 里面加入：
	nb.add("third",1);
	
一种方案实现 String List();
package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes= new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);//
	}
	
	public void removNote(int index) {
	 notes.remove(index);
	}
	
	public String[] list() {
		String[] a=new String[notes.size()];
		for(int i=0; i<notes.size(); i++) {
			a[i]=notes.get(i);
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= new String[2];
		a[0]="first";
		a[1]="second";
		NoteBook nb= new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third",1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0)); //
		System.out.println(nb.getNote(1));
		System.out.println(nb.getNote(2));
		System.out.println();
		nb.removNote(1);
		String[] b= nb.list();
		for(String s:b) {
			System.out.println(s);
		}
		
	}

}


另外一种方案实现： String[] List:
package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes= new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	
	public void add(String s, int location) {
		notes.add(location, s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);//
	}
	
	public void removNote(int index) {
	 notes.remove(index);
	}
	
	public String[] list() {
		String[] a=new String[notes.size()];
//		for(int i=0; i<notes.size(); i++) {
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= new String[2];
		a[0]="first";
		a[1]="second";
		NoteBook nb= new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third",1);
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0)); //
		System.out.println(nb.getNote(1));
		System.out.println(nb.getNote(2));
		System.out.println();
		nb.removNote(1);
		String[] b= nb.list();
		for(String s:b) {
			System.out.println(s);
		}	
	}
}


// 16 3-2 对象数组-1 

String[] 这个数组里， 放着什么？

public String[] list() {
		String[] a=new String[notes.size()];
		
//		for(int i=0; i<notes.size(); i++) {
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}

	如果有：
	int [] ia=new int[10];
	String[] a=new String[notes.size()];
	
	a 里放着什么东西？？？
	测试一下：
	public static void main(String[] args){
		int [] ia=new int [10];
		String[] a= new String[10];
		System.out.println(ia[0]);
		System.out.println(a[0]);
	}	
	
OUTPUT:
0
null // 说明现在a[0] 并不存在

再次测试：
public static void main(String[] args){
		int [] ia=new int [10];
		String[] a= new String[10];
		System.out.println(ia[0]+2);
		System.out.println(a[0]+"a");
	}	

OUTPUT:
2
nulla // ？？？


再次测试：
public static void main(String[] args){
		int [] ia=new int [10];
		String[] a= new String[10];
		System.out.println(ia[0]+2);
		System.out.println(a.length());
		System.out.println(a[0].length()); // 长度： 出现异常
		// 
	}	

OUTPUT:
Line 6: error: cannot find symbol: method length()

String s=null;
System.out.println(s.length());

OUTPUT:
NUllPointerException 

再次测试：
String s=null;
System.out.println(s.length());
结果一样：  OUTPUT:
NUllPointerException 

用 string 做一个数组出来： String 类型的数组 里面每一个元素到底是什么？


再次测试：
public static void main(String[] args){
		int [] ia=new int [10];
		String[] a= new String[10];
		System.out.println(ia[0]);
		
		for (int i=0; i<a.length;i++ ){
			a[i]=""+i;
		}
		System.out.println(a[0].length());
	}


public class Test{
    public static void main(String[] args){
		int [] ia=new int [10];
		String[] a= new String[10];
	//	System.out.println(ia[0]);
		
		for (int i=0; i<a.length;i++ ){
			a[i]=""+i;
		}
		System.out.println(a[0].length());
}
}

OUTPUT: 1

在对象数组中的每个元素都是对象的管理者 而非 对象本身



//17 3-2 对象数组-2  for-each 
//http://blog.csdn.net/mcy478643968/article/details/3488861
1 java中的length属性是针对数组说的,比如说你声明了一个数组,想知道这个数组的长度则用到了length这个属性.

2 java中的length()方法是针对字符串String说的,如果想看这个字符串的长度则用到length()这个方法.

3.java中的size()方法是针对泛型集合说的,如果想看这个泛型有多少个元素,就调用此方法来查看!

 

这个例子来演示这两个方法和一个属性的用法

 public static void main(String[] args) {
        String []list={"ma","cao","yuan"};
        String a="macaoyuan";
        System.out.println(list.length);
        System.out.println(a.length());


        List<Object> array=new ArrayList();
        array.add(a);
        System.out.println(array.size());
    }

 
输出的值为:

3

9

1


public static void main(String[] args )
{
	int [] ia=new int[10];
	
	for(int i=0; i<ia.length;i++){
		ia[i]=i;
	}
	
	for(int k:ia){
		System.out.println(k);
	}
}

class Value{
	private int i;
	
	public void set(int i)
	{
		this.i=i;
	}
	
	public int get(){
		return i;
	}			


	public static void main(String[] args){
		
		Value[] a= new Value[10];
		for(int i=0; i<a.length;i++){
			a[i]= new Value(); // important
			a[i].set(i);
		}
		
		for(Value v:a){
			System.out.println(v); //？？？
		}
	}
}

OUTPUT:
Value@6d06d69c
Value@7852e922
Value@4e25154f
Value@70dea4e
Value@5c647e05
Value@33909752
Value@55f96302
Value@3d4eac69
Value@42a57993
Value@75b84c92


改：
class Value{
	private int i;
	
	public void set(int i)
	{
		this.i=i;
	}
	
	public int get(){
		return i;
	}			


	public static void main(String[] args){
		
		Value[] a= new Value[10];
		for(int i=0; i<a.length;i++){
			a[i]= new Value();
			a[i].set(i);
		}
		
		for(Value v:a){
			System.out.println(v.get()); //？？？
		}
	}
}	

进一步测试：
class Value{
	private int i;
	
	public void set(int i)
	{
		this.i=i;
	}
	
	public int get(){
		return i;
	}			

	public static void main(String[] args){
		
		Value[] a= new Value[10];
		for(int i=0; i<a.length;i++){
			a[i]= new Value();
			a[i].set(i); // 这里改成0
		}
		
		for(Value v: a){
			System.out.println(v.get());
			v.set(0);
		}
		
		
		for(Value v:a){
			System.out.println(v.get()) //？？？
		}
	}
}

OUTPUT:
0
1
2
3
4
5
6
7
8
9
0
0
0
0
0
0
0
0
0
0

在 for each 循环里 无法改变整数型的数组每个元素的值
但是在 Value[] a 这里数组里是可以的 (对象数组)
for each 循环的意思是：

for(Value v: a)
1.	v=a[0]
2.  v=a[1]
.
.
.
.

for each 循环对  对象数组来说：
在循环的每一轮： 循环可以拿到那个数组 元素所管理的对象
可以对 对象 做操作了
package notebook;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes= new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public boolean removNote(int index) {
		return true;
	}
	
	public String[] list() {
		return new String[10]; //?

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= new String[2];
		a[0]="first";
		a[1]="second";
		NoteBook nb= new NoteBook();
		nb.add("first");
		nb.add("second");
		System.out.println(nb.getSize());
	}

}


那么 容器类： 可以这样吗？
class A{
	private ArrayList<String> notes=new ArrayList<String>();
	
	public void add(String s){
		notes.add(s);
	}

public static void main(String[] args){
	ArrayList<String> a= new ArrayList<String>();
	a.add("first");
	a.add("second");
	
	for(String s:a){
		System.out.println(s);
		}
	}
}

OUTPUT:
first
second


// 18 3-3 集合容器 集合set

set 容器


public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int balance =0;
	while(true){
		System.out.println("请投币");
		int amoutn=in.nextInt();
		balance=balance+amount;
		if(balance>=10)
		{
			System.out.println("***************");
			System.out.println("Java 专线");
			System.out.println("票价");
			System.out.println("************");
			System.out.println("找零： "+ (balance-10));
		System.out.println();
			balance=0;
		}	
	}
}



public static void main(String[] args)
{
	ArrayList<String> a= new ArrayList<String>();
	a.add("first");
	a.add("second");
	a.add("third");
	
	for(String s :a){
		System.out.println(s);
	}
	
	System.out.println("*************");
	
	HashSet<String> s= new HashSet<String>();
	
	s.add("first");
	s.add("second");
	s.add("third");
		
	for(String k :s){
		System.out.println(k);
	}
}

OUTPUT:

class Value{
	private int i;
	public void set(int i)
	{
		this.i=i;
	}
	
	public int get(){
		return i;
	}

	public String toString(){
		return ""+i;
	}
	// 任何一个Java类，只要实现了一个 
	// public String toString()  必须完全一样的函数
	就可以直接输出： System.out.println(v); 输出这个v对象
	会 主动调用这个 String toString();
	用toString函数 产生的String ， 直接输出 出来
}


public class A{
	
public static void main(String[] args)
{
	Value v= new value();
	System.out.println(v);
	
	ArrayList<String> a= new ArrayList<String>();
	a.add("first");
	a.add("second");
	a.add("third");
	
		System.out.println(a);
	
	System.out.println("*************");
	
	HashSet<String> s= new HashSet<String>();
	
	s.add("first");
	s.add("second");
	s.add("first");
		
	System.out.println(s);
	}
}

OUTPUT:
[first, second, third]
*************
[first, second]


//19 3-4 Hash表
1 penny
5 nickel
10 dime
25 quarter
50 half dollar

// 给一个整数， 出来一个 单词
package coins;

import java.util.Scanner;
import java.util.HashMap;

public class Coin{
	private HashMap<Integer, String> coinnames= new HashMap<Integer, String>();
	
	public Coin()
	{
		coinnames.put(1,"penny ");
		coinnames.put(5,"nickel");
		coinnames.put(10,"dime");
		coinnames.put(25,"quarter ");
		coinnames.put(50,"half-dollar");
		coinnames.put(50,"五毛"); // 留下来的 一定是相同键值的最后一个
		System.out.println(coinnames.keySet().size());
		System.out.println(coinnames);
		
		for(Integer k: coinnames.keySet())
		{
			String s = coinnames.get(k);
			System.out.println(s);
		}
	}
	
	
	public String getName(int amount){
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else 
			return "Not Found";
	}
	
	public static void main(String[] args){
		Scanner in= new Scanner (System.in);
		int amount=in.nextInt();
		Coin coin=new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
		
	}
}
































