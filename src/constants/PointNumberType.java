package constants;

public enum PointNumberType implements ConstType<Integer> {
	
	Slime(0, "スライム"),
	LargeCrow(1, "大烏"),
	VenomTaka(2, "毒鷹"),
	HeroOfLegend(3, "伝説の勇者"),
	SnowQueen(4, "雪の女王"),
	SpiritOfLight(5, "光の精霊"),
	DeadOfHell(6, "地獄の死者"),
	Satan(7, "サタン"),
	HolyKnights(8, "光の騎士団"),
	God(9, "神");
	
	private int value;
	private String name;
	
	@Override
	public Integer getValue() {
		return this.value;
	}

	@Override
	public String getLabel() {
		return this.name;
	}

	private PointNumberType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
}
