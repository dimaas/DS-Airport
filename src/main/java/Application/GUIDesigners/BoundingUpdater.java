package Application.GUIDesigners;

import Model.Airplane;
import Model.Airport;
import Model.Route;
import Service.ManagementProvider;
import Validator.InvalidAttributeException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author M
 */
public class BoundingUpdater {

    List<Airplane> airplanes = new ArrayList<>();
    List<Route> routes = new ArrayList<>();
    List<Airport> airports = new ArrayList<>();

    ManagementProvider managementProvider;

    public BoundingUpdater(ManagementProvider managementProvider) {
        this.managementProvider = managementProvider;
    }

    public void updateBoundings() throws InvalidAttributeException {
        for (Airplane a : airplanes) {
            managementProvider.getAirplaneManager().updateAirplane(a);
        }
        for (Route r : routes) {
            managementProvider.getRouteManager().updateRoute(r);
        }
        for (Airport a : airports) {
            managementProvider.getAirportManager().updateAirport(a);
        }
        clean();
    }

    public void addAirplane(Airplane airplane) {
        if (!airplanes.contains(airplane)) {
            airplanes.add(airplane);
        }
    }

    public void addAirport(Airport airport) {
        if (!airports.contains(airport)) {
            airports.add(airport);
        }
    }

    public void addRoute(Route route) {
        if (!routes.contains(route)) {
            routes.add(route);
        }
    }

    public void clean() {
        airplanes = new ArrayList<>();
        routes = new ArrayList<>();
        airports = new ArrayList<>();
    }
    
}
