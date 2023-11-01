public class Discounts {
    public static void main(String[] args) {
        final int TShortPrice = 900;
        final int TShortSelected = 2;
        final int NumberOfTShortForSale = 4;
        int BuyForSale = NumberOfTShortForSale - TShortSelected;
        int PriceSelected = TShortPrice * TShortSelected;
        int PriceBuyForSale = BuyForSale * TShortPrice;
        final double Discount = 0.4;
        double PriceWithDiscount = NumberOfTShortForSale * TShortPrice - ((NumberOfTShortForSale * TShortPrice) * Discount);
        double TShortPriceDiscount = PriceWithDiscount / NumberOfTShortForSale;
        double SaveMoney = (TShortPrice * NumberOfTShortForSale) - (TShortPriceDiscount * NumberOfTShortForSale);
        double FreeTShort = SaveMoney / TShortPrice;

        System.out.println(FreeTShort);
    }
}