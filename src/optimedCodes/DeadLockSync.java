package optimedCodes;

public class DeadLockSync {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        WalletService walletService = new WalletService();
        accountService.setWalletService(walletService);
        walletService.setAccountService(accountService);
        Thread t1 = new Thread(() -> accountService.transferMoneyA(1L, 1L));
        Thread t2 = new Thread(() -> walletService.transferMoneyB(1L, 1L));
        t1.start();
        t2.start();
    }
}

class AccountService {
    private WalletService walletService;
    public void setWalletService(WalletService walletService) {
        this.walletService = walletService;
    }
    public synchronized void transferMoneyA(Long accountId, Long walletId) {
        System.out.println("AccountService locked Account");
        System.out.println(walletService.hashCode());
        synchronized (walletService) {
            System.out.println("AccountService locked Wallet");
        }
    }
}

class WalletService {
    private AccountService accountService;
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    public synchronized void transferMoneyB(Long walletId, Long accountId) {
        System.out.println("WalletService locked Wallet");
        System.out.println(accountService.hashCode());
        synchronized (accountService) {
            System.out.println("WalletService locked Account");
        }
    }
}
