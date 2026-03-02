package secure_investment_portfolio_engine;

public class InvestmentRejectedException extends RuntimeException {
    public InvestmentRejectedException(String message) {
        super(message);
    }
}
