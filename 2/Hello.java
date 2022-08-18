//这是java的一个hello程序,演示java开发
//1.public class Hello 表示Hello是一个类，是一个public（公有）的类
//2.Hello{} 表示一个类的开始和结束
//3.public static void main(string[] args) 表示一个主方法，即我们程序的入口
//4.main（）{}表示方法的开始和结束
//5.System.out.println("hello,world~");//表示输出Hello word~到屏幕/分号表示语句结束;
//6.java源文件/.class字节码文件（可以执行的java程序）
//7.改变.java文件不能改变输出结果，必须重新编译成.class文件才能改变
//8.java应用程序的执行入口为main()有固定的书写形式public static void main(String[] args){...}
//9.java严格区分大小写以‘;’代表结束
//10.一个源文件中最多只能有一个public类，其他类不限
//11.public类的名字必须和文件名字相同（Hello 对应Hello.java）
//12.main不一定要运行在public下，也可以运行在非public
//13.java源文件以.java作为拓展名，源文件的基本组成部分为类class
public class Hello
{
	//编写一个main方法
	public static void main(String[] args)
	{
		System.out.println("刘浩开始学习java");
	}
}
//Dog Tiger 为一个类
//只要有一个类编译过后就会生成一个对应的class文件
class Dog{
	public static void main(String[] args)
	{
		System.out.println("你好 小狗");
	}
}

class Tiger{
	public static void main(String[] args)
	{
		System.out.println("你好 小老虎");
	}
}
//如何学习java
//学习原理基本方法（先不考虑细节）
