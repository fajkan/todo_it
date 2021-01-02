package data;

public class PersonSequencer {
    private static int personId;

    static int nextPersonId(){
        personId++;
        return personId;
    }

    static int reset(){
        personId = 0;
        return personId;
    }
}
