//에라토스테네스의 체
//주어진 수까지의 배열 선언 후
//2부터 시작해 주어진 수의 루트값까지
//차례로 뒤의 배수들을 지워나간다.
//남은 수가 소수

public static void main(String[] args) {
		int num=100;

		int[] arr=new int[num+1];
		for(int i=2;i<=num;i++)
			arr[i]=i;

		for(int i=2;i<=Math.sqrt(num);i++) {
			if(arr[i]==0)
				continue;
			for(int j=i+i;j<=num;j+=i) {
				arr[j]=0;
			}
		}

		for(int i=2;i<=num;i++) {
			if(arr[i]!=0)
				System.out.println(i);
		}
	}
