package arraypgm;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
	   //int a[]; //declaration
		//a=new int[5]; //instantiation
		
		//int a[]=new int[5];
		// a[0]=10;
		 //a[1]=20;
		
		int a[]= {10,20,30,40,50};
		System.out.println(a.length);
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		for(int i=0 ; i<a.length ;i++)  //0 ,1,2,3,4,5
		{
			System.out.println(a[i]);  // 10 ,20,30,40,50
		}
	}

}
