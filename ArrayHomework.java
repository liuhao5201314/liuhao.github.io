//1.BD
//String str[]=new String[]{"a","b","c"}=
//String str[]=new String[3]
//2.blue

import java.util.Scanner;
import java.util.Arrays;
public class ArrayHomework{
	public static void main(String[] args){
		String foo="bule";
		boolean[] bar=new boolean[2];//booleanĬ��Ϊflase
		if(bar[0]){
			foo="green";
		}
		System.out.print(foo);
	}
}
//3.1 3 5 7
//4.
//1.����+��λ
//1.���������������index��=arr[i],˵��i������Ҫ����ĵط�
//2.ʹ��index����i
//3.������û�з��־�Ҫ�ŵ����
//4.����ʹ��ѭ������Ҫ��ӵ���
class ArrayHomework4{
	public static void main(String[] args){
		int arr[]={10,12,45,90};
		int i=0;
		System.out.println("����ǰ������Ϊ:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n");
		Scanner input=new Scanner(System.in);
		int arrNew[]=new int[arr.length+1];
		for(i=0;i<arr.length;i++){
			arrNew[i]=arr[i];
		}
		System.out.println("����Ҫ�����Ԫ��");
		int in=input.nextInt();//charAt(0)
		arrNew[arrNew.length-1]=in;
		arr=arrNew;
		int j=0;
		int tem;
		for(i=0;i<(arr.length-1);i++){//��Ҫ4��
			for(j=0;j<(arr.length-i-1);j++){//��һ����Ҫ4��
				if(arr[j]>arr[j+1]){
					tem=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println("����������Ϊ:");
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
		System.out.println("����ǰ������Ϊ:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n");
		Scanner input=new Scanner(System.in);
		int arrNew[]=new int[arr.length+1];
		System.out.println("����Ҫ�����Ԫ��");
		int in=input.nextInt();//charAt(0)
		for(i=0;i<arr.length;i++){
			if(in<=arr[i]){
				idex=i;
				break;//һ���־�Ҫ�˳�
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
		// 		j++;//����Ҫ��ӵ�����ʹ��i��j�������������±�
		// 	}else{
		// 		arrNew[i]=in;
		// 	}
		// }
		// arr=arrNew;
	}
}

//5.Math.random()���������Math.random()*100+1
//1.���������
//2.�����ӡ
//3.��ƽ��ֵ
//4.�������ֵ 1.˳�����2.���ַ�����
//5.����±�
//6.�����Ƿ���8
class ArrayHomework5{
	public static void main(String[] args){
		int count[]=new int[10];
		int i=0;
		int j=0;
		double average=0;//��ƽ��ֵ
		int sum=0;//���
		int subscript=0;//��¼���ֵ�±�
		int dex=-1;
		for(i=0;i<10;i++){
			count[i]=(int)(Math.random()*100+1);
		}
		System.out.println("����ǰ�õ��������");
		for(i=0;i<count.length;i++){
			System.out.print(count[i]+"\t");
		}
		int tem[]=new int[10];
		for(i=0,j=9;i<count.length&&j>=0;i++,j--){
			tem[i]=count[j];
		}
		count=tem;
		System.out.println("\n");
		System.out.println("����õ��������");
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
		System.out.println("ƽ��ֵΪ:"+average+"���ֵΪ��"+max+"�±�Ϊ��"+subscript);
		if(dex==-1){
			System.out.println("����û��8");
		}else{
			System.out.println("���������8"+"���±�Ϊ��"+dex);
		}
	}
}

//6.a,a
//  z,z
//  ��,��
//  c,c
class ArrayHomework6{
	public static void main(String[] args){
		char arr1[]={'a','z','b','c'};
		char arr2[]=arr1;
		arr1[2]='��';
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr1[i]+","+arr2[i]);
		}
	}
}

//7.ð���������
//n�����ͽ���n-1�֣�
//��n�ν���n-1-i�ζԱ�
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
		System.out.println("����������Ϊ:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}