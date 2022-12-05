package section4.sample2;

public class MainEx1{
	public static void main(String[] args){
		AttackPower attackPower = new AttackPower(20);
		// 中略
		Thread mt1 = new Thread(new MultiThread1(attackPower));
		Thread mt2 = new Thread(new MultiThread2(attackPower));

		mt2.start();
		mt1.start();
	}
}

class MultiThread1 implements Runnable {
	AttackPower _attackPower;
	public MultiThread1(AttackPower attackPower){
		_attackPower = attackPower;
	}
	public void run(){
		//スレッド処理
		for(int i=0; i<10; i++){
			_attackPower.reinForce(5);
			System.out.println("attack power : " + _attackPower._value);
		}
	}
}

class MultiThread2 implements Runnable {
	AttackPower _attackPower;
	public MultiThread2(AttackPower attackPower){
		_attackPower = attackPower;
	}
	public void run() {
		//別のスレッド処理
		for(int i=0; i<10; i++){
			_attackPower.disable();
			System.out.println("attack power : " + _attackPower._value);
		}
	}
}
