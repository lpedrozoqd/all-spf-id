package edu.clarape.al.allspfid.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingServicesImpl implements GreetingServices {

    @Override
    public String sayGreetings() {
        return "Hello world - ES";
    }
    
}
