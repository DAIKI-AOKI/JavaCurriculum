	
	// 下でScannerを使用するための文

	import java.util.Scanner;

	class Positive {

		public static void main(String args[]){

		//キーボードからの入力をstdInに代入する。
		Scanner stdIn = new Scanner(System.in);

		//stdInから数値を取り出し、nに代入する。
		int n = stdIn.nextInt();

		if(n > 0){
			System.out.println("その値は正です。");
		}else {
			System.out.println("その値は０か負です。");

		}
		

	}

  }