package rectangledbmi.com.pittsburghrealtimetracker.world;

import android.graphics.Color;

/**
 * Created by epicstar on 9/5/14.
 */
public class Route {

    /**
     * This is the route number
     */
    private String route;

    /**
     * This is the route's general 3 word summary
     */
    private String routeInfo;

    /**
     * This is the color of the route as an int
     */
    private int routeColor;

    /**
     * Null constructor of the route
     */
    public Route() {
        this(null, null, null);
    }

    public Route(String route) {
        this(route, null, null);
    }

    /**
     * The non-null constructor of the route and color as a string or hex-string
     * @param route the route number
     * @param routeInfo the route info
     * @param routeColor the color of the route as a string or string-hex
     */
    public Route(String route, String routeInfo, String routeColor) {
        this(route, routeInfo, Color.parseColor(routeColor));
    }

    /**
     * The main route constructor
     * @param route the route number
     * @param routeInfo the route info
     * @param routeColor the color of the route as an int
     */
    public Route(String route, String routeInfo, int routeColor) {
        this.route = route;
        this.routeInfo = routeInfo;
        this.routeColor = routeColor;
    }

    /**
     *
     * @return the route number
     */
    public String getRoute() {
        return route;
    }

    /**
     * Set the route number
     * @param route the route number to be set
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * @return the route info
     */
    public String getRouteInfo() {
        return routeInfo;
    }

    /**
     * Sets the route info
     * @param routeInfo the route info
     */
    public void setRouteInfo(String routeInfo) {
        this.routeInfo = routeInfo;
    }

    /**
     *
     * @return the route color as an int
     */
    public int getRouteColor() {
        return routeColor;
    }

    /**
     * set the route color as an int
     * @param routeColor the route color as an int
     */
    public void setRouteColor(int routeColor) {
        this.routeColor = routeColor;
    }

    /**
     * set the route color if a String is fed
     * @param routeColor the route color as a String
     */
    public void setRouteColor(String routeColor) {
        setRouteColor(Color.parseColor(routeColor));
    }

    /**
     * Gets the int color as a hex string from:
     * http://stackoverflow.com/questions/4506708/android-convert-color-int-to-hexa-string
     *
     * @return color as hex-string
     */
    public String getColorAsString() {
        return String.format("#%06X", 0xFFFFFF & routeColor);
    }

    /**
     * Auto-Generated by Android Studio
     * @return String of Route
     */
    @Override
    public String toString() {
        return route + " - " + routeInfo;
    }
}
