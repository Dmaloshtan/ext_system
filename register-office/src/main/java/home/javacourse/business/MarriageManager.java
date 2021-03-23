package home.javacourse.business;

import home.javacourse.dao.MarriageDao;
import home.javacourse.domain.MarriageCertificate;
import home.javacourse.view.MarriageRequest;
import home.javacourse.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    private MarriageDao marriageDao;

    public void setMarriageDao(MarriageDao marriageDao) {
        this.marriageDao = marriageDao;
    }

    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");
//        MarriageCertificate certificate = marriageDao.findMarriageCertificate(request);

        return new MarriageResponse();
    }

}
