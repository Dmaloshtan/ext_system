package home.javacourse.dao;

import home.javacourse.domain.MarriageCertificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class MarriageDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);

    private EntityManager entityManager;

    public MarriageDao(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        entityManager = factory.createEntityManager();
    }



    public MarriageCertificate findMarriageCertificate(){
        Query namedQuery = entityManager.createNamedQuery("MarriageCertificate.findCertificate");
        namedQuery.setParameter("certificateId",1L);
        return (MarriageCertificate) namedQuery.getSingleResult();
    }

}
