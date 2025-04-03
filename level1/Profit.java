public class Profit {
    public static void main(String[] args) {
        int costprice = 129;
        int sellingprice = 191;
        int profit = sellingprice - costprice;
        double profitpercentage = ((double) profit / costprice) * 100; // Corrected division

        // Corrected string concatenation using + operator
        System.out.println("The Cost Price is INR " + costprice + 
                           " and Selling Price is INR " + sellingprice + 
                           "\nThe Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitpercentage + "%");
    }
}
