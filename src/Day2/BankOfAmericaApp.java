package Day2;

public class BankOfAmericaApp {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

      //  account1.accountNumber = "123456789";



        account1.setAccountHolderName("Taman Neupane");
        account1.setAccountType("Saving");
        account1.setConnectedMobileNumber("9851184633");
        account1.setAddress("Kathmandu, Nepal");
        account1.setBsbNumber("001");
        account1.setAccountBalance("50000.0");
        account1.setSocialSecurityNumber("987654321");

        BankAccount account2 = new BankAccount();

        System.out.println(account1.socialSecurityNumber());
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getAccountHolderName());
        System.out.println(account1.getAccountType());
        System.out.println(account1.getConnectedMobileNumber());
        System.out.println(account1.getAccountBalance());
        System.out.println(account1.getAddress());





    }
}
