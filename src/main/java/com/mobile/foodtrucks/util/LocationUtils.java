package com.mobile.foodtrucks.util;

public class LocationUtils {

    /**
     * Determine the nearby latitude and longitude range based on the incoming latitude and longitude and radius range
     *
     * @param longitude
     * @param latitude
     * @param distance
     * @return
     */
    public static NearRange getNearbyLocation(double longitude, double latitude, double distance) {

        //Calculate the latitude and longitude range of the query point first
        double r = 6371;//Earth radius in kilometers
        double dlng = 2 * Math.asin(Math.sin(distance / (2 * r)) / Math.cos(latitude * Math.PI / 180));
        dlng = dlng * 180 / Math.PI;//Convert angles to radians
        double dlat = distance / r;
        dlat = dlat * 180 / Math.PI;
        double minlat = latitude - dlat;
        double maxlat = latitude + dlat;
        double minlng = longitude - dlng;
        double maxlng = longitude + dlng;

        NearRange nearRange = new NearRange();
        nearRange.setMaxLatitude(maxlat);
        nearRange.setMinLatitude(minlat);
        nearRange.setMaxLongitude(maxlng);
        nearRange.setMinLongitude(minlng);
        return nearRange;
    }

    /**
     * Longitude and latitude verification
     * longitude: (?:[0-9]|[1-9][0-9]|1[0-7][0-9]|180)\\.([0-9]{6})
     * latitude：  (?:[0-9]|[1-8][0-9]|90)\\.([0-9]{6})
     *
     * @return
     */
    public static boolean checkItude(String longitude, String latitude) {
        String reglo = "((?:[0-9]|[1-9][0-9]|1[0-7][0-9])\\.([0-9]{0,6}))|((?:180)\\.([0]{0,6}))";
        String regla = "((?:[0-9]|[1-8][0-9])\\.([0-9]{0,6}))|((?:90)\\.([0]{0,6}))";
        longitude = longitude.trim();
        latitude = latitude.trim();
        return longitude.matches(reglo) == true ? latitude.matches(regla) : false;
    }
}
