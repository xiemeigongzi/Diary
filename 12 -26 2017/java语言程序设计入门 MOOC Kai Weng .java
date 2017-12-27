// java语言程序设计入门 MOOC Kai Weng 

file： switch workspace other


Scanner in = new Scanner(System.in);
System.out.println("echo:"+in.nextLine());
in.close();



package hello;
import java.util.Scanner;

public class Hello{
	public static void main(String[],args)
	{
		Scanner in = new Scanner(Sysetem.in);
		System.out.printlin("echo:"+in.nextLine());
	}
}


Scanner in = new Scanner(System.in);
Sysetem.out.printlin("100-23="+(100-in.nextInt());


Scanner in=new Scanner(Sysetem.in);
Sysetem.out.printlin("100-23="+(100-in.nextInt());

System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));


Scanner in=new Scanner(System.in);
int price;
price = in.nextInt();
Sysetem.out.printlin("100-"+price"="+(100-price));


Scanner in = new Scanner(System.in);
int price , amount;
price = in.nextInt();
amount= in.nextInt();
Sysetem.out.print(amount+"-"+price+"="+(amount-price));


//7 class 
int price , amount;
Scanner in = new Scanner (System.in);
price = in.nextInt();
amount = in.nextInt();

Sysetem.out.println(amount-price);





// 21 比较
System.out.println(7>=4+3)  true ;
System.out.println(5=5.0)  true ;
double a=1.0;
double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
Sysetem.out.println(Math.abs(a-b)<1e-6);

final int MINOR = 35;
		System.out.print("输入你的年龄");
		Scanner in=new Scanner (System.in);
		int age =in.nextInt();
		System.out.println("你的年纪是："+age);
		
		if(age<MINOR)
		{
			System.out.println("年轻是美好的");
		}
		
		System.out.println("好好珍惜吧！");
		
		

		int x;
		int y;
		int z;
		System.out.println("input 3 numbers:");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		int max=0;
		if(x>y)
		{
			if(x>z)
			{
				max=x;
			}
			else {
				max=z;
			}
		}
		else //(x<y)
		{
			if(y<z)
			{
				max=z;
			}
			else {
				max=y;
			}
		}
		System.out.println(max);
		
		}
	}

	
	int x=10; 
		int f;
		if(x>0)
			f=2*x;
		else if(x==0)
			f=0;
		else 
			f=-1;
		
		System.out.println(f);
		
		// 22 判断5 
		
		Scanner in=new Scanner (System.in);
		int type=in.nextInt();
		switch(type)
		{
			case 1:
			case 2:
				System.out.println("你好");
				break;
			case 3:
				System.out.println("晚上好！");
				break;
			case 4: 
				System.out.println("bye");
				break;
			default:
				System.out.println("what?");
				break;
		}
		
		
// 3 1 
Scanner in=new Scanner (System.in);
		int balance =0;
		while (true)
		{
			int amount = in.nextInt();
			balance = amount+balance;
			if(balance >=10)
			{
				System.out.println(balance-10);
				balance=0;
			}
		}
		
// 3 2 
Scanner in=new Scanner (System.in);
		int number = in.nextInt();
		int cnt=0;
		while(number>0)
		{
		number=number/10;
		cnt++;
		System.out.println("number="+number+";cnt="+cnt); 
		}
		System.out.println(cnt);
		in.close();
		
		
// 23 3 2 
Scanner in=new Scanner (System.in);
		int number =in.nextInt();
		int cnt=0;
		int sum=0;
		while(number!=-1)
		{
			sum=sum+number;
			cnt++;
			number=in.nextInt();
		}
		if(cnt>0)
		{
		System.out.println("average="+(double)(sum/cnt));
		}
		
		
Scanner in=new Scanner (System.in);
		int number =(int) (Math.random()*100+1);// [0-1)-->[1,100]
		int cnt=0;
		int a;
		do
		{
			a=in.nextInt();
			if(a>number)
			{
				System.out.println("bigger");
			}
			else if(a<number)
			{
				System.out.println("smaller");
			}
			cnt++;
		}while(number!=a);
		System.out.println("猜对了，"+cnt+"次");
	}
	
	
	// 25 
	Scanner in=new Scanner (System.in);
		int number =in.nextInt();
		int result=0;
		int cnt=0;
		do {
			int digit =number %10;
			result=result*10+digit;
			number=number/10;
			cnt++;
		}while(number>0);
		System.out.println("猜对了，"+cnt+"次");
		System.out.println("the result="+result);
		
		
		
//  26 4 1 
Scanner in=new Scanner (System.in);
int n=in.nextInt();
int factor;
int i;
for(i=1;i<=n;i++)
{
	factor*=i;
}
}

// 28 4 2 
Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int isPrime=1;
		int i;
		
		for(i=2;i<n;i++) {
			if(n%i==0)
			{
				isPrime=0;
				break;
			}
		}
		if(isPrime==1)
			System.out.println("n is a prime");
		else 
			System.out.println("n is not a prime");
		
// 29 4 2 -2 
// 100以内的素数
int n;
		int i;
		for(n=2;n<100;n++)
		{
			int isPrime=1;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=0;
				}
			}
			if(isPrime==1)
				System.out.print(n+"  ");
		}
		
		
int n=2;
		int i;
		int cnt=0;
		while(cnt<=50)
		{
			int isPrime=1;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					isPrime=0;
			}
			if(isPrime==1) {
				System.out.print(n+" ");
			cnt++;
			}
			n++;
		}	
		
		
Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int a,b,c;
		for(a=0;a<=amount;a++)
		{
			for(b=0;b<=amount/5;b++)
			{
				for(c=0;c<=amount/10;c++)
				{
					if(a+5*b+10*c==amount)
					{
						System.out.println(a+"*1 + "+b+"*5 +"+c+"*10 ="+amount);
					}
				}
			}
		}
		

		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int a,b,c;
		for(a=0;a<=amount;a++)
		{
			for(b=0;b<=amount/5;b++)
			{
				for(c=0;c<=amount/10;c++)
				{
					if(a+5*b+10*c==amount)
					{
						System.out.println(a+"*1 + "+b+"*5 +"+c+"*10 ="+amount);
						break;
					}
					break;
				}
				break;
			}
		}
		
Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int a,b,c;
		int isExit=0;
		OUT:
		for(a=0;a<=amount;a++)
		{
			for(b=0;b<=amount/5;b++)
			{
				for(c=0;c<=amount/10;c++)
				{
					if(a+5*b+10*c==amount)
					{
						System.out.println(a+"*1 + "+b+"*5 +"+c+"*10 ="+amount);
						break OUT;
					}
					
				}
			
			}
		}
		
	
// 31 4 3 
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		double sum=0.0;
		for(i=1;i<=n;i++)
		{
			sum+=1.0/i;
		}
		System.out.printf("%.2f",sum);
		
	
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		int sign=1;
		double sum=0.0;
		for(i=1;i<=n;i++)
		{
			sum+=sign*1.0/i;
			sign=-1*sign;
		}
		System.out.printf("%.2f",sum);
		
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		int sign=1;
		double sum=0.0;
		for(i=1;i<=n;i++)
		{
	//		sum+=sign*1.0/i;
	//		sign=-1*sign;
			if(i%2==1)
			{
				sum+=1.0/i;
			}
			else {
				sum+=-1.0/i;
			}
		}
		System.out.printf("%.2f",sum);
		
		
		
		
Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int gcd=1;
		int i;
		for(i=2;i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("a and b max gcd is "+gcd);
		
		
Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int t;
		while(b!=0)
		{
			t=a%b;
			a=b;
			b=t;
		}
		System.out.println("a and b the gcd is "+a);
		

		
// 33 5 1 array
Scanner in=new Scanner (System.in);
		int x;
		int [] numbers=new int[100];
		x=in.nextInt();
		int cnt=0;
		double sum=0;
		while(x!=-1)
		{
			numbers[cnt]=x;
			sum+=x;
			cnt++;
			x=in.nextInt();
		}
		if(cnt>0)
		{
			double average=1.0*sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(sum/cnt);
		}
		
		
// 34 5 1 （2）

// 35 5 1 （3）
for(i=0;i<grade.length;++i)
	sum+=grade[i];


// 36 5 1(4)
Scanner in=new Scanner(System.in);
		int x;
		int [] numbers =new int [10];
		for(int i=0;i<10;i++)
		{
			numbers[i]=0;
			System.out.print(numbers[i]);
		}
		x=in.nextInt();
		while(x!=-1)
		{
			if(x>=0 &&x<=9)
			{
				numbers[x]++;
			}
			x=in.nextInt();
		}
		
		for(int j=0;j<=numbers.length;++j) // numbers.length 
		{
			System.out.println(j+": "+numbers[j]);
		}
		
		

		
		
// 37 
Scanner in=new Scanner(System.in);
		int [] scores= {87,98,69,54,65,76,87,99,100,103};
		System.out.println(scores.length);
		int i;
		for(i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}
		
		
		Scanner in=new Scanner(System.in);
		int [] a=new int [10];
		a[0]=5;
		int []b=a;
		b[0]=16;
		System.out.println(a[0]);
		
OUTPUT: 16 
		

		
int []a1= {1,2,3,4,5};
		int []a2=a1;
		int i;
		for(i=0;i<a2.length;i++)
		{
			a2[i]++;
		}
		
		for(i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
OUTPUT: 2 3 4 5 6 		
		
int []a= {1,2,3,4,5};
		int []b=new int[a.length];
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

		
int []a= {1,2,3,4,5};
		int []b=new int[a.length];
		int i;
		boolean isEqu=true;
		for(i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<b.length;i++) {
			if(b[i]!=a[i])
				{
				isEqu=false;
				break;
				}
			System.out.println(b[i]);
		}
		System.out.println(isEqu);
		
		
//38 5 2 (2)

Scanner in=new Scanner(System.in);
		int []data= {3,2,5,7,4,9,11,34,12,28};
		int x=in.nextInt();
		int loc=-1;
		int i;
		boolean found =false;
		for(i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc=i;
				break;
			}
		}
		
		for(int j:data)
		{
			System.out.print(j+" ");
		}
		
		for(int k:data)
		{
			if(k==x)
			{
				found=true;
			}
		}
		
		
		if(loc>-1)
		{
			System.out.println(x+":"+loc);
		}
		

		
//39 5 2 (3)
// 这个重点看 important

	Scanner in=new Scanner(System.in);
		int []primes=new int[50];
		primes[0]=2;
		int cnt=1;
		MAINLOOP:
		for(int x=3;cnt<50;x++)
		{
			for(int i=0;i<cnt;i++)
			{
				if(x%primes[i]==0)
				{
					continue MAINLOOP;
				}
			}
			primes[cnt++]=x;
		}
		
		for(int k :primes)
		{
			System.out.print(k+" ");
		}

// 我自己写了一个C的
// 50 prime numbers;
#include <stdio.h>
int main()
{
	int i,j;
	int n=50;
	int a[n];
	int cnt=0;
	for(i=2;cnt<n;i++)
	{
		int isPrime=1;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime=0;
			}
		}
		
		if(isPrime==1)
		{
			a[cnt]=i;
			cnt++;
		}
	}
	
	for(i=0;i<n;i++)
	{
		printf("a[%d] =%d \n",i,a[i]);
	}
	return 0;
 } 
 
39 的剩余部分没有看 不想看

40 也不想看

// 41-42 6 1 
Scanner in=new Scanner(System.in);
		char c='A';
		char d=(char)(c+'a'-'A');
		System.out.println(d);
		System.out.println('A'>'a');


// 43 6 1 （3）
System.out.println(Integer.MAX_VALUE);

4个字节=32 bite 
-2^31 - 0 - 2^31

包裹类型：
	基础类型       包裹类型：
	boolean:     Boolean
	char         Character 
	int 		 Integer 
	double 		 Double 
	
Integer.MAX_VALUE ; //important

Charater 
static boolean isDigit(char ch)
判断这个字符是不是数字

static boolean isLetter(char ch)

static boolean isLetterOrDigit(char ch)

static boolean isLowerCase(char ch)

static boolean isUpperCase(char ch)

static boolean isWhitespace(char ch)
判断这个字符是不是空格

static boolean toLowerCase(char ch)
把这个字符转成小写

static boolean toUpperCase (char ch)
把这个字符转成大写

char ch='1';
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isDigit('a'));
		
	
// 44 6 2 （1）
String s=new String ("a string");
		String a=new String("hello");
		System.out.println(s+" "+a);
		
		
		
String s=new String("hello");
		System.out.println(s+12+24);
		
Output： hello1224


Scanner in=new Scanner(System.in);
		String s;
		s=in.nextLine();// in.nextLine
		System.out.println(s);
		
		String a=in.next();
		System.out.println(a);
		

比较两个string
if(input=="bye")
{
	
}

if(input.equals("bye"))
{
	
}


Scanner in=new Scanner (System.in);
		String s=in.nextLine();
		System.out.println(s);
		System.out.println(s.equals("bye")); //important 
		
		
// 45 6 2 (2)
Scanner in = new Scanner(System.in);
		String s1="abc";
		String s2="abb";
		System.out.println(s1.compareTo(s2)); //omportant
		
Output:1 

		
String s1="abc";
		String s2="abcd";
		System.out.println(s1.compareTo(s2));
	
Output:-1 


String s2="abcd";
		System.out.println("abcd".compareTo(s2));
		
Output：0；

访问String里的字符：
s.charAt(index);
返回index上的单个字符；
index的范围是： 0到length()-1;
第一个字符的index是0，和数组一样
不能用for-each 循环来遍历字符串

Integer K；
int []data=new int [20];
for(int k: data) 遍历一个数组


Scanner in=new Scanner (System.in);
		String s1="abc";
		System.out.println(s1.charAt(1));
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		
得到子串：
s.substring(n)
	得到从n 号位置到末尾的全部内容；
	
s.substring(b,e)
	得到从b号位置到e号位置之间的内容
	
Scanner in=new Scanner(System.in);
		String s1="0123456789";
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 4));
OUTPUT： 23456789
        23
		
寻找字符：
s.indexOf(c);
	得到c字符所在的位置，-1表示不存在；
	
s.indexOf(c,n)
	从n号开始寻找c字符；
	
s.indexOf(t);
	找到字符串t所在的位置；
	
从右边开始找：
s.lastIndexOf(c);

s.lastIndexOf(c,n);

s.lastIndexOf(t);

其他String操作：
s.startsWith(t) // 是不是以另外一个子字符串开头的；

s.endsWith(t) //是不是以另外一个子字符串结尾的；

s.trim() //把字符串两端的空格删掉；

s.replace(c1,c2) // 把字符串中所有的 c1 全部换成 c2

s.toLowerCase() //把字符串中所有的字符换成大写字符

s.toUpperCase() //

这些操作都不会改变字符串自己
Scanner in=new Scanner(System.in);
		String s1="0123A4567893"; // double 3 
		int loc=s1.indexOf('3');
		System.out.println(s1.indexOf('3',loc));
		System.out.println(s1.indexOf('3',loc+1));
		System.out.println(s1.indexOf('4'));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.indexOf('C'));
		System.out.println(s1.indexOf("A456"));
		
		
		
Scanner in=new Scanner (System.in);
		String s1="abcd";
		s1.toUpperCase();
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);

Output: 
abcd
ABCD

在switch-case 中使用字符串：

switch (s)
{
	case "this": ....break;
	case "that":....break;
}

// 46 6 2 (3)
Math :
abs //绝对值
pow // pow(a,b) a的b次方 = a^b;
random // 随机数： 0-1 
round //四舍五入

Scanner in=new Scanner (System.in);
		System.out.println(Math.abs(-12));
		System.out.println(Math.round(10.345));
		System.out.println(Math.round(10.745));
		System.out.println(Math.random());
		System.out.println(Math.random()*100);
		System.out.println(Math.pow(2, 3.2));
		
		
// 47 7 1 (1)
// 函数的定义和调用
对象的操作： .
求素数：
public static boolean isPrime(int i)
{
	boolean isPrime = true;
		
		for(int k=2;k<i;k++)
		{
			if(i%k==0)
			{
				isPrime=false;
				break;	
			}				
		}
		return isPrime;
}

public static void main(String[]args){
	
Scanner in=new Scanner(System.in);
int m=in.nextInt();
int n=in.nextInt();

	if(m==1) 
		m=2;
	
	int cnt=0;
	int sum=0;
	for(int i=m;i<=n;i++)
	{
		
		if(isPrime(i)){
			cnt++;
			sum+=i;
		}
	}
	System.out.println(cnt);
}

// compete code :
// get the prime numbers between n & m;
import java.util.Scanner;

public class Hello {
	
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
			
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					isPrime=false;
					break;	
				}				
			}
			return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();

			if(m==1) 
				m=2;
			
			int cnt=0;
			int sum=0;
			for(int i=m;i<=n;i++)
			{
				
				if(isPrime(i)){
					cnt++;
					sum+=i;
					System.out.println(i);
				}
			}
			System.out.println(cnt);
	}
}

// 求 1 -10 20-30 35-45 的和
// done by myself 
import java.util.Scanner;

public class obtainSum {
	
	public static int sumNumber(int m, int n){
		int i;
		int sum=0;
		for(i=m;i<=n;i++)
			sum+=i;
		
		return sum;
	}
	
	public static void main(String[] args){

		int sum1;
		sum1=sumNUmber(1,10);
		System.out.println(sum1);
		
		int sum2=sumNUmber(20,30);
		System.out.println(sum2);
		
		int sum3=sumNUmber(35,45);
		System.out.println(sum3);
	}
}

		
// standard 
import java.util.Scanner;

public class Main(){
	
	public static void sum(int a, int b){
		int i, s=0;
		for(i=a;i<=b;i++)
			s+=i;
		
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner (System.in);
		int i;
		int sum;
		sum(1,10);
		sum(10,20);
		sum(35,45);
	}
}

		
// 48 调用函数 7 1 （2）
（ ）： 圆括号 起到了 表示函数调用的作用
没有参数也需要（ ）；
如果有参数： 需要给出正确的数量和顺序

从函数中 返回值：

public static int max(int a, int b)
{
	int ret;
	if(a>b)
		ret=a;
	else 
		ret=b;
	
	return ret;
}

public static void main(String[] args)
{
	int a=5;
	int b=6;
	int c;
	c=max(10,12);
	c=max(a,b);
	c=max(a,23);
	c=max(c,23);
	
	c=max(max(c,a),max(5,b));
	System.out.println(max(a,b));
	max(12,23);
}

	
// 49 7 2 （1） 参数传递
char  int  double  
	
import java.util.Scanner;
public class Swap{

public static void swap(int a, int b)
{
	int t;
	t=a;
	a=b;
	b=t;
}

public static void main(String[] args)
{
	int a=5;
	int b=6;
	swap(a,b);
	System.out.println(a+" "+b);
}
}
OUTPUT:
a=5, b=6

		
// 50 7 2 (2) 本地变量

public static int factor (int i)
{
	if(i==1)
		return i;
	else 
		return i*factor(i-1);
}

public class Main(){
	
	public static int factor(int i)
	{
		if(i==1)
			return i;
		else 
			return i*factor(i-1);
	}
	
	public static void main(String[] args)
	{
		int k=factor(3);
		System.out.println(k);
	}
}

本地变量的规则：
本地变量是定义在块内的
	它可以是定义在函数的块内
	它也可以是定义在语句的块内
	甚至可以遂安拉一对大括号来定义变量
	
程序运行进入这个块以前，其中的变量不存在
离开这个块，其中的变量就消失了



		






















