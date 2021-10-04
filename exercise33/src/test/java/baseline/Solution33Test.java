package baseline;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void main() {

        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();

        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println(response);
    }
}