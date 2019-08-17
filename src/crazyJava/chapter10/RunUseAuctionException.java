package crazyJava.chapter10;

/**
 * Created by force_to on 2016/10/3.
 */
public class RunUseAuctionException {
    public RunUseAuctionException() {
        try {
            new UseAuctionException("10000");
        } catch (AuctionException e) {
            System.out.println(e.getMessage());
        }
    }
}
