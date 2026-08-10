package interfaces;

public class OnlineTransfer {

    public static void main(String[] args){


        BankGateway bankGateway = new RazorPay();
        bankGateway.accountLogin();
        bankGateway.checkBalance();
        bankGateway.creditBalance();
        bankGateway.debitBalance();

        BankGateway bankGateway1 = new PayPal();
        bankGateway1.accountLogin();
        bankGateway1.checkBalance();
        bankGateway1.creditBalance();
        bankGateway1.debitBalance();

    }

}
