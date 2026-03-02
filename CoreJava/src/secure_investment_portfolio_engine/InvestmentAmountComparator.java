package secure_investment_portfolio_engine;

import java.util.Comparator;

public class InvestmentAmountComparator implements Comparator<InvestmentTransaction> {
    @Override
    public int compare(InvestmentTransaction a, InvestmentTransaction b) {
        return Double.compare(a.getInvestedAmount(), b.getInvestedAmount());
    }
}
