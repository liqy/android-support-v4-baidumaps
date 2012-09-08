package com.liqy.android.apis;

public final class Locations {
    public static final class Entry {
        public Entry(double lat, double lng, int zoomLevel) {
            this.lat = lat;
            this.lng = lng;
            this.zoomLevel = zoomLevel;
        }
        
        public final double lat;
        public final double lng;
        
        /** Google Maps zoom level to display */
        public final int zoomLevel;
    }
    
    /**
     * Our data, part 1.
     */
    public static final String[] NAMES = 
    {
            "Seattle",   
            "Cabo San Lucas",
            "Bora Bora",
            "Eiffel Tower"
    };
    
    /**
     * Our data, part 2.
     */
    public static final Entry[] ENTRIES = 
    {
        new Entry(39.90923, 116.397428, 12),
        new Entry(39.9022, 116.3922, 7),
        new Entry(39.917723, 116.3722, 5),
        new Entry(39.917723, 121.294254, 18)
    };
}
