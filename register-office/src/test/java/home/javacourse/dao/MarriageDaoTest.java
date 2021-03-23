package home.javacourse.dao;

import home.javacourse.domain.MarriageCertificate;
import home.javacourse.view.MarriageRequest;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MarriageDaoTest {

    @Test
    public void findMarriageCertificate() {

        MarriageDao dao = new MarriageDao();
        MarriageCertificate certificate = dao.findMarriageCertificate();
        System.out.println(certificate);

    }
}