package driver;
import store.Product;

/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		//店舗名表示
		System.out.println();
		Product.displayStoreName();

		
		//インスタンス化（２商品）
		Product keybord = new Product("キーボード",4500);
		Product mouse = new Product("マウス",2000);
		
		
		//値下げ・値上げ
		keybord.down();
		mouse.up(500);
		
		System.out.println();
		keybord.display();
		mouse.display();
		
	
		
	}
}
