package baseline;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void main() {

        class Record {
            String firstName;
            String lastName;
            String position;
            Date seperationDate;
            public Record(String firstName, String lastName,
                          String position, Date seperationDate) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.position = position;
                this.seperationDate = seperationDate;
            }
        }
    }
}