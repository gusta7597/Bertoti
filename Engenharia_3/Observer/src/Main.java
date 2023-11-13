public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        
        WebApp webApp = new WebApp();
        MobileApp mobileApp = new MobileApp();
        
        shop.registerObserver(webApp);
        shop.registerObserver(mobileApp);
        
        shop.setDiscountAvailable();
    }
}

