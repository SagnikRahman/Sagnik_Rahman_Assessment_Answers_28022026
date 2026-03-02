package secure_investment_portfolio_engine;

public final class EquityInvestment extends InvestmentTransaction {

    public EquityInvestment(
            String transactionId,
            String investorName,
            double investedAmount
    ) throws InvalidInvestmentException {
        super(transactionId, investorName, investedAmount, InvestmentType.EQUITY);
    }

    @Override
    public InvestmentTransaction applyAdjustment(double bonusPercent)
            throws InvalidInvestmentException {

        validatePercentage(bonusPercent);

        double bonus = getInvestedAmount() * bonusPercent / 100;
        return new EquityInvestment(
                getTransactionId(),
                getInvestorName(),
                getInvestedAmount() + bonus
        );
    }

    @Override
    public boolean authorize() {
        return true;
    }

    @Override
    public boolean authorize(String securityCode) {
        if (!"EQT123".equals(securityCode)) {
            throw new InvestmentRejectedException("Equity authorization failed");
        }
        return true;
    }

    private void validatePercentage(double p) throws InvalidInvestmentException {
        if (p < 0 || p > 30) {
            throw new InvalidInvestmentException("Bonus must be between 0 and 30%");
        }
    }
}
