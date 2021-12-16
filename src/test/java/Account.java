
public class Account {
			private long balance;
			private String Accno;
			
			Account(int amt){
				balance=amt;
				}
			
			public void withdraw(int amt) {
				String msg="";
				try {
				balance=balance-amt;
				msg="Transaction success";
				} catch (Exception e){
					msg="Failed try again";
				}
				System.out.println(msg);
			}
			public void deposit(int amt) {
				String msg="";
				try {
				balance=balance+amt;
				msg="Transaction success";
				} catch (Exception e){
					msg="Failed try again";
				}
				System.out.println(msg);
		}

			





}
