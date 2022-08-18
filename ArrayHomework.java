//1.BD
//String str[]=new String[]{"a","b","c"}=
//String str[]=new String[3]
//2.blue

import java.util.Scanner;
import java.util.Arrays;
public class ArrayHomework{
	public static void main(String[] args){
		String foo="bule";
		boolean[] bar=new boolean[2];//boolean默认为flase
		if(bar[0]){
			foo="green";
		}
		System.out.print(foo);
	}
}
//3.1 3 5 7
//4.
//1.扩容+定位
//1.遍历数组如果发现index《=arr[i],说明i就是需要插入的地方
//2.使用index保留i
//3.遍历完没有发现就要放到最后
//4.可以使用循环跳过要添加的数
class ArrayHomework4{
	public static void main(String[] args){
		int arr[]={10,12,45,90};
		int i=0;
		System.out.println("插入前的数组为:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n");
		Scanner input=new Scanner(System.in);
		int arrNew[]=new int[arr.length+1];
		for(i=0;i<arr.length;i++){
			arrNew[i]=arr[i];
		}
		System.out.println("请输要插入的元素");
		int in=input.nextInt();//charAt(0)
		arrNew[arrNew.length-1]=in;
		arr=arrNew;
		int j=0;
		int tem;
		for(i=0;i<(arr.length-1);i++){//需要4轮
			for(j=0;j<(arr.length-i-1);j++){//第一个需要4次
				if(arr[j]>arr[j+1]){
					tem=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println("插入后的数组为:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
class ArrayHomework44{
	public static void main(String[] args){
		int arr[]={10,12,45,90};
		int i=0;
		int idex=-1;
		System.out.println("插入前的数组为:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n");
		Scanner input=new Scanner(System.in);
		int arrNew[]=new int[arr.length+1];
		System.out.println("请输要插入的元素");
		int in=input.nextInt();//charAt(0)
		for(i=0;i<arr.length;i++){
			if(in<=arr[i]){
				idex=i;
				break;//一发现就要退出
			}
		}
		if(idex==-1){
			idex=arr.length;
		}
		for(i=0;i<idex;i++){
			arrNew[i]=arr[i];
		}
		arrNew[idex]=in;
		for(i=(idex+1);i<arrNew.length;i++){
			arrNew[i]=arr[i-1];
		}
		arr=arrNew;
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		// for(it i=0,j=0;i<arrNew.length;i++){
		// 	if(i!=idex){
		// 		arrNew[i]=arr[j];
		// 		j++;//跳过要添加的数字使用i和j二个变量跳过下标
		// 	}else{
		// 		arrNew[i]=in;
		// 	}
		// }
		// arr=arrNew;
	}
}

//5.Math.random()生成随机数Math.random()*100+1
//1.生成随机数
//2.倒叙打印
//3.求平均值
//4.查找最大值 1.顺序查找2.二分法查找
//5.输出下标
//6.查找是否有8
class ArrayHomework5{
	public static void main(String[] args){
		int count[]=new int[10];
		int i=0;
		int j=0;
		double average=0;//求平均值
		int sum=0;//求和
		int subscript=0;//记录最大值下标
		int dex=-1;
		for(i=0;i<10;i++){
			count[i]=(int)(Math.random()*100+1);
		}
		System.out.println("排序前得到的随机数");
		for(i=0;i<count.length;i++){
			System.out.print(count[i]+"\t");
		}
		int tem[]=new int[10];
		for(i=0,j=9;i<count.length&&j>=0;i++,j--){
			tem[i]=count[j];
		}
		count=tem;
		System.out.println("\n");
		System.out.println("倒叙得到的随机数");
		int max=count[0];
		for(i=0;i<count.length;i++){
			System.out.print(count[i]+"\t");
			sum+=count[i];
			if(i<=8&&count[i+1]>max){
				max=count[i+1];
				subscript=i+1;
			}
			if(count[i]==8){
				dex=i;
			}
		}
		average=sum/10.0;
		System.out.println("\n");
		System.out.println("平均值为:"+average+"最大值为："+max+"下标为："+subscript);
		if(dex==-1){
			System.out.println("数组没有8");
		}else{
			System.out.println("数组存在有8"+"其下标为："+dex);
		}
	}
}

//6.a,a
//  z,z
//  韩,韩
//  c,c
class ArrayHomework6{
	public static void main(String[] args){
		char arr1[]={'a','z','b','c'};
		char arr2[]=arr1;
		arr1[2]='韩';
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr1[i]+","+arr2[i]);
		}
	}
}

//7.冒泡排序代码
//n个数就进行n-1轮；
//第n次进行n-1-i次对比
class ArrayHomework7{
	public static void main(String[] args){
		int i=0;
		int j=0;
		int tem=0;
		int arr[]={33,24,56,46,43,78,46,8};
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					tem=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println("排序后的数组为:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}