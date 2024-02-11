package design.problems.tictactoe;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


class BoardTest {

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("running " + testInfo.getDisplayName());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void move() {
        Assert.assertEquals(1, 1);
    }
}