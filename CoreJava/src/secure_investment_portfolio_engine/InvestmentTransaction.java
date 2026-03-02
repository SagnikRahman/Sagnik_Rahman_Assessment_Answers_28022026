package secure_investment_portfolio_engine;

public abstract class InvestmentTransaction implements Authorizable {

    private final String transactionId;
    private final String investorName;
    private final double investedAmount;
    private final InvestmentType investmentType;

    protected InvestmentTransaction(
            String transactionId,
            String investorName,
            double investedAmount,
            InvestmentType investmentType
    ) throws InvalidInvestmentException {

        if (investedAmount <= 0) {
            throw new InvalidInvestmentException("Invested amount must be greater than 0");
        }

        this.transactionId = transactionId;
        this.investorName = investorName;
        this.investedAmount = investedAmount;
        this.investmentType = investmentType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    public abstract InvestmentTransaction applyAdjustment(double percentage)
            throws InvalidInvestmentException;
}
