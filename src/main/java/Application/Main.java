package Application;

import Model.Airplane;
import Model.Airport;
import Model.Route;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by M on 27. 4. 2016.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Airplane airplane = em.find(Airplane.class, 101);
        System.out.println(airplane);

        Airport airport = em.find(Airport.class, 301);
        System.out.println(airport);

        Route route = em.find(Route.class, 401);
        System.out.println(route);



        //System.out.println(airport);

        //airplane.getRoutes().add(null);


//finding by ID
        //Airplane booka = em.find(Airplane.class, 1);
        //System.out.println("Finding book> "+booka);
    }

    public static Airplane insertAirplane(EntityTransaction tx, EntityManager em){
        // ID = 101
        Airplane airplane = Airplane.createAirplane(50, 25, "AIRLINE", 5, 10, "CODE_123");
        tx.begin();
        em.persist(airplane);
        tx.commit();
        return airplane;
    }

    public static Route insertRoute(EntityTransaction tx, EntityManager em, Airport destination, Airport origin){
        //ID = 401
        Route route = Route.createRoute();
        route.setDestination(destination);
        route.setOrigin(origin);
        tx.begin();
        em.persist(route);
        tx.commit();
        return route;
    }

    public static Airport insertAirport(EntityTransaction tx, EntityManager em){
        //ID = 301
        Airport airport = Airport.createAirport("London", "Heathrow", "ICAO", "IAT", "Great Britain");
        tx.begin();
        em.persist(airport);
        tx.commit();
        return airport;
    }
}
