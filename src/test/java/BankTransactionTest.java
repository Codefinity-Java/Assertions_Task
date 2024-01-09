import codefinity.BankTransaction;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTransactionTest {

    @Test
    public void testInitialBalancePositive() {
        double initialBalance = 100.0;
        BankTransaction bt = new BankTransaction(initialBalance);
        double expected = 100.0;
        double actual = bt.getBalance();
        fail();
    }

    @Test
    public void testInitialBalanceNegative() {
        double initialBalance = -100.0;
        BankTransaction bt = new BankTransaction(initialBalance);
        double expected = 0.0;
        double actual = bt.getBalance();
        assertEquals(expected, actual, 0.001);
        fail();
    }

    @Test
    public void testDeposit() {
        BankTransaction bt = new BankTransaction(100.0);
        double depositAmount = 50.0;
        boolean depositResult = bt.deposit(depositAmount);
        fail();

        double expected = 150.0;
        double actual = bt.getBalance();
        fail();
    }

    @Test
    public void testDepositNegativeAmount() {
        BankTransaction bt = new BankTransaction(100.0);
        double depositAmount = -50.0;
        boolean depositResult = bt.deposit(depositAmount);
        assertFalse(depositResult);

        double expected = 100.0;
        double actual = bt.getBalance();
        fail();
    }

    @Test
    public void testWithdrawSuccessful() {
        BankTransaction bt = new BankTransaction(100.0);
        double withdrawalAmount = 50.0;
        boolean withdrawalResult = bt.withdraw(withdrawalAmount);
        fail();

        double expected = 50.0;
        double actual = bt.getBalance();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankTransaction bt = new BankTransaction(50.0);
        double withdrawalAmount = 100.0;
        boolean withdrawalResult = bt.withdraw(withdrawalAmount);
        fail();

        double expected = 50.0;
        double actual = bt.getBalance();
        fail();
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankTransaction bt = new BankTransaction(100.0);
        double withdrawalAmount = -50.0;
        boolean withdrawalResult = bt.withdraw(withdrawalAmount);
        fail();

        double expected = 100.0;
        double actual = bt.getBalance();
        fail();
    }
    
    @Test
    public void testNotNullBankTransaction() {
        BankTransaction bt = new BankTransaction(100.0);
        fail();
    }

    @Test
    public void testNullBankTransaction() {
        BankTransaction bt = null;
        fail();
    }
}
