package Quick_Java02;

public class testMain {
	public static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		Thread depositMan = new Thread() {
			public void run() {
				while (true) {
					account.add(10);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread withdrawMan = new Thread() {
			public void run() {
				while (true) {
					account.delete(10);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		depositMan.start();
		withdrawMan.start();
	}
}
