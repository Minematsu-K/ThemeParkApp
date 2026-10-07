
public class Main {

	public static void main(String[] args) {
		ThemePark park1=new ThemePark();
		
		int chargeAmount=10000;
		
		System.out.println("チャージ金額："+chargeAmount+"円");
		
		int admissionCost=park1.calculateAdmissionFee();
		System.out.println("入園料："+admissionCost+"円");
		
		int attractionCost=park1.calculateAttractionFee(2);
		System.out.println("アトラクション料金："+attractionCost+"円");
		
		int foodCost=park1.caluculateFoodFee("カレー");
		System.out.println("フード料金："+foodCost+"円");
		
		int totalCost=admissionCost+attractionCost+foodCost;
		chargeAmount-=totalCost;
		
		System.out.println();
		System.out.println("利用料金の合計："+totalCost+"円");
		System.out.println("支払い後のチャージ残高："+chargeAmount+"円");
	}

}
