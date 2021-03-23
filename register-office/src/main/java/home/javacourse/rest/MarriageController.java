package home.javacourse.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import home.javacourse.business.MarriageManager;
import home.javacourse.view.MarriageRequest;
import home.javacourse.view.MarriageResponse;

public class MarriageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageController.class);

    private MarriageManager marriageManager;

    public void setMarriageManager(MarriageManager marriageManager) {
        this.marriageManager = marriageManager;
    }

    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");
        return marriageManager.findMarriageCertificate(request);
    }
}
