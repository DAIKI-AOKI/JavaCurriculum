class Hello3{

	
	//↓この１行はプログラムの開始場所を示します。（詳細は後述）

	public static void main(String[] args){

	//printlnはメソッドと呼び、プログラムの部品です。
	//ここでは、「カッコ内の文字を表示」という命令を出しています。

	 System.out.println("1行目の表示");

	//printメソッドは「改行せずにカッコ内の文字を表示」
	System.out.print("２行目です。");
	System.out.print("これも２行目に表示されます。");
	//カッコ内を空にすることで開業ができます。
	System.out.println();

	//「\n」は改行を表します。
	System.out.print("３行目は文字の途中で\n改行されます。");

	}

  }