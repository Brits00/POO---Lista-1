public interface IEntityValidation {
    
    Object Person = null;
    Object PersonIndividual = Person;

    public default boolean isValid() {
        if (new PersonIndividual().validar(IEntityValidation.PersonIndividual))
            return true;
        return false;
        
        
    }
}
