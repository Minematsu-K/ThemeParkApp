
public class ThemePark {
	
	int admissionFee=3000;
	int attractionPrice=800;
	
	int calculateAdmissionFee() {
		return admissionFee;
	}
	
	int calculateAttractionFee(int count) {
		return attractionPrice*count;
	}
	
	int caluculateFoodFee(String menu) {
		switch(menu) {
			case "カレー":
				return 900;
			case "ハンバーガー":
				return 700;
			case "フライドポテト":
				return 500;
			default:
				return 0;
		}
	}
	
	String  createCouponMessage(int paymentAmount) {
		if(paymentAmount>=5000) {
			return "ご利用ありがとうございました。次回から使えるクーポンをどうぞ！";
		}else {
			return "ご利用ありがとうございました！";
		}
	}
}
