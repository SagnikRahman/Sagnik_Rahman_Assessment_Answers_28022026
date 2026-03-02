package secure_investment_portfolio_engine;

public interface Authorizable {
    boolean authorize();
    boolean authorize(String securityCode);
}
