package secure_investment_portfolio_engine;

import java.util.*;

public class DriverMain {

    public static void main(String[] args) {

        try {
            InvestmentTransaction equity =
                    new EquityInvestment("TXN101", "Sagnik", 100000);

            InvestmentTransaction debt =
                    new DebtInvestment("TXN102", "Raj", 80000);

            InvestmentTransaction equityAfterBonus = equity.applyAdjustment(10);	// 10% bonus

            InvestmentTransaction debtAfterTax = debt.applyAdjustment(5);			// 5% tax

            equityAfterBonus.authorize();
            equityAfterBonus.authorize("EQT123");

            debtAfterTax.authorize();
            debtAfterTax.authorize("DEBT456");

            List<InvestmentTransaction> portfolio = new ArrayList<>();
            portfolio.add(equity);
            portfolio.add(debt);
            portfolio.add(equityAfterBonus);
            portfolio.add(debtAfterTax);

            portfolio.sort(new InvestmentAmountComparator());

            System.out.println("Sorted Investment Portfolio");
            for (InvestmentTransaction it : portfolio) {
                System.out.println(
                        it.getTransactionId() + " | " +
                        it.getInvestorName() + " | " +
                        it.getInvestmentType() + " | " +
                        it.getInvestedAmount()
                );
            }

        }
        catch (InvalidInvestmentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
        catch (InvestmentRejectedException e) {
            System.out.println("Authorization Failed: " + e.getMessage());
        }
    }
}
