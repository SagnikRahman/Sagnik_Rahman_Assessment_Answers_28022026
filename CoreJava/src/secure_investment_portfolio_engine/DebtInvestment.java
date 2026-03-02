package secure_investment_portfolio_engine;

public final class DebtInvestment extends InvestmentTransaction {

    public DebtInvestment(
            String transactionId,
            String investorName,
            double investedAmount
    ) throws InvalidInvestmentException {
        super(transactionId, investorName, investedAmount, InvestmentType.DEBT);
    }

    @Override
    public InvestmentTransaction applyAdjustment(double taxPercent)
            throws InvalidInvestmentException {

        validatePercentage(taxPercent);

        double tax = getInvestedAmount() * taxPercent / 100;
        return new DebtInvestment(
                getTransactionId(),
                getInvestorName(),
                getInvestedAmount() - tax
        );
    }

    @Override
    public boolean authorize() {
        return true;
    }

    @Override
    public boolean authorize(String securityCode) {
        if (!"DEBT456".equals(securityCode)) {
            throw new InvestmentRejectedException("Debt authorization failed");
        }
        return true;
    }

    private void validatePercentage(double p) throws InvalidInvestmentException {
        if (p < 0 || p > 30) {
            throw new InvalidInvestmentException("Tax must be between 0 and 30%");
        }
    }
}
