package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int i = 0;
        // while `counter` is less than length of array
        while (i < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person fella = personArray[i];
            // get `string Representation` of `currentPerson`
            String desc = fella.toString();
            // append `stringRepresentation` to `result` variable
            result += desc;
            i++;

            // end loop
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        for (int i = 0; i < personArray.length; i++) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person fella = personArray[i];
            // get `string Representation` of `currentPerson`
            String desc = fella.toString();
            // append `stringRepresentation` to `result` variable
            result += desc;
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        for (Person p : personArray) {
            // begin loop
            // get `string Representation` of `currentPerson`
            String desc = p.toString();
            // append `stringRepresentation` to `result` variable
            result += desc;
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
