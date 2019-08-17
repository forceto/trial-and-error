package crazyJava.chapter10;

/**
 * Created by force_to on 2016/10/3.
 */
public class UseAuctionException {
    private double startPrice = 3000.0;

    public UseAuctionException(String price) throws AuctionException{
        double p = 0.0;
        try {
            p = Double.parseDouble(price);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new AuctionException("输入的必须是double型数字");
        }

        if (startPrice > p) {
            throw new AuctionException("出价不能比初始价格低");
        } else {
            System.out.println("恭喜你获得此拍品");
        }



    }
}