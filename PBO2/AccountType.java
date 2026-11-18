package PBO2;

/** Enum tipe akun dengan kode internal bank dan suku bunga. */
public enum AccountType {
    SAVINGS("SA", 0.025),
    CREDIT("CR", 0.0),
    DEPOSIT("DP", 0.045);

    private final String code;
    private final double interestRate;

    AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
