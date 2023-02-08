package section4.sample1;

class AttackPower{
	static final int MIN = 0;
	int _value;  //finalがついていないので可変

	public AttackPower(int value){
		if(value < MIN){
			throw new IllegalAccessError("ERROR! : value < MIN");
		}
		_value = value;
	}
}
