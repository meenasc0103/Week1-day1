package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int firstNum=0;
		int secNum =1;
		int sum;
		int length=11;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=2;i<=length;i++) {
		
			sum = firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
	}

}
}
