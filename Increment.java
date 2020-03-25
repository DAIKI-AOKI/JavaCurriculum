	
	// 下でScannerを使用するための文

	import java.util.Scanner;
	
	// クラス名はファイル名と一致していれば何でも可

	class Increment {

		public static void main(String args[]){


		//キーボードからの入力をstdInに代入する。
		Scanner stdIn = new Scanner(System.in);

 		//文字を表示してから入力待ちをする。
		System.out.println("何個'*'を表示しますか？");

		//stdInから数値を取り出し、nに代入する。
		int n = stdIn.nextInt();


		if(n >= 1 && n <= 99 ){
			
			for (int i =0; i < n; i++){
				System.out.print('*');
		}
		//改行する
		System.out.println();

	} else {
		System.out.println("0～99までの数字を入力してください");
		}
	}

  }