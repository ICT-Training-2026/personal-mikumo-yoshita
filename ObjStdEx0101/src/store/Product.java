package store;

public class Product {
	/******** フィールド ******************************************/
	/**
	 * 店舗名
	 */
	private static final String STORE_NAME = "速水PC販売店";
	
	/**
	 *標準変更金額
	 */
	private static final int DEFAULT_CHANGE_AMT = 1000;
	
	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private int price;

	/******** コンストラクタ******************************************/
	/**
	 * name 商品名初期値
	 * price　価格初期値
	 */
	public Product(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	//オーバーロード
	public Product(String name){
		this(name,0);
	}

	/******** メソッド ******************************************/
	/**
	 * 店舗名の表示
	 */
	public static void displayStoreName() {
		System.out.println("店舗名:"+ STORE_NAME);
	}
	
	/**
	 * ●メソッド名：up
	・処理概要：フィールド price に加算する
	・引数：値上げ金額(加算金額)
	・戻り値：値上げ後の価格

	 */
	public int up(int amt) {
		return price += amt;
	}

	//標準変更金額の値上げ
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	/**
	 * ●メソッド名：down
	・処理概要：フィールド price から減算する
	・引数：値下げ金額(減算金額)
	・戻り値：値下げ後の価格
	 */
	public int down(int amt) {
		return price -= amt;
	}
	
	
	//オーバロード
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	/**
	 * 処理概要：商品情報を以下の形式で表示する
	 */
	public void display() {
		System.out.println(name +"：" + price + "円");
	}
}
