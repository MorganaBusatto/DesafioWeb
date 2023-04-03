package Framework.Utils;

import java.util.Locale;


import com.github.javafaker.Faker;

public class FakersGeneration {
    
    private Faker faker;
    private String fullName;
    private String adressEmail;
    private String passwordSenha;
    
    public FakersGeneration() {
        
        faker = new Faker(new Locale("pt-BR"));
    }
    
    public String getFullName() {
        
       fullName = faker.name().fullName();
       return fullName;
       
    }
    
    public String getAdressEmail() {
        
        adressEmail = faker.internet().emailAddress();
        return adressEmail;
    }
    
    public String getPasswordSenha() {
        
        passwordSenha = faker.internet().password();
        return passwordSenha;
        
    }
    
    
    
}
