	
	// 下でScannerを使用するための文

	import java.util.Scanner;

	class EvenOdd {

		public static void main(String args[]){

		//キーボードからの入力をstdInに代入する。
		Scanner stdIn = new Scanner(System.in);

		//stdInから数値を取り出し、nに代入する。
		int n = stdIn.nextInt();

		if(n > 0){
		
		//等価演算子：n/2と0が等しければtrue、そうでなければfalseを生成

			if(n % 2 == 0){
			System.out.println("その値は偶数です。");
		}else {
			System.out.println("その値は奇数です。");

		}
		
		}else{
		
			System.out.println("その値は整数ではありません。");
		
		}
	}

  }