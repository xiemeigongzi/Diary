// java

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
		
		for(int j=0;j<=numbers.length;++j)
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
		
39 的剩余部分没有看 不想看

40 也不想看
		
		

		






















