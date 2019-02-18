package bd.ac.bracu.cse420.validator;

import bd.ac.bracu.cse420.validator.parser.Domain;
import bd.ac.bracu.cse420.validator.parser.Local;

public class EmailValidator {
    private Domain domainValidator;
    private Local localValidator;

    public EmailValidator() {
        domainValidator = new Domain();
        localValidator = new Local();
    }

    public boolean validateEmail(String email) {
        String[] localDomainParts = email.split("@");
        if (localDomainParts.length != 2)
            return false;

        return domainValidator.validateDomainPart(localDomainParts[1]) && localValidator.validateLocalPart(localDomainParts[0]);
    }
}
