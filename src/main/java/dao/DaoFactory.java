package dao;

import dao.Ads;
import dao.Config;
import dao.MySQLAdsDao;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
