package section5.summary.refactorSakamoto;

// ログ出力用のstaticメソッドの作成
public class Logger {

	static void printInfo(final String infoMessage) {
		System.out.println("Info : " + infoMessage);
	}

	static void printError(final String errorMessage) {
		System.out.println("Error : " + errorMessage);
	}
}
