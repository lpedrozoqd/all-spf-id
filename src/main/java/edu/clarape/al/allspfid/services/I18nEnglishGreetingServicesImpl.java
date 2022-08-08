package edu.clarape.al.allspfid.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServicesImpl implements GreetingServices {

    @Override
    public String sayGreetings() {
        return "Hello world - EN";
    }
    
}
