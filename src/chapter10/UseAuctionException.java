package chapter10;

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
            throw new AuctionException("����ı�����double������");
        }

        if (startPrice > p) {
            throw new AuctionException("���۲��ܱȳ�ʼ�۸��");
        } else {
            System.out.println("��ϲ���ô���Ʒ");
        }



    }
}













