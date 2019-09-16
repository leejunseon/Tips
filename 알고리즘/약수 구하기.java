//주어진 수의 루트값까지만 약수를 구해도 전체 약수를 구할 수 있음

public static void main(String[] args) {
		int num=10;
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				if(i==Math.sqrt(num))
					System.out.println(i);
				else {
					System.out.println(i);
					System.out.println(num/i);
				}
			}
		}
	}
