	
	// 下でScannerを使用するための文

	import java.util.Scanner;

	class Season {

		public static void main(String args[]){

		System.out.println("今日は何月ですか？");

		//キーボードからの入力をstdInに代入する。
		Scanner stdIn = new Scanner(System.in);

		//stdInから数値を取り出し、nに代入する。
		int n = stdIn.nextInt();


		if(n >= 3 && n <= 5 ){
			System.out.println("季節は春です。");
		
		}else if (n >= 6 && n <=8){
			System.out.println("季節は夏です。");
		
		}else if (n >=9 && n <=11){
			System.out.println("季節は秋です。");

		}else if (n == 12 || n == 1 || n == 2){
			System.out.println("季節は冬です。");	
			
		}else{
			System.out.println("その月はありません。");
		
		}
	}

  }