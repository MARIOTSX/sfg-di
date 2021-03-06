package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("18nService")
public class I18EnglishService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hi world";
    }
}