import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

private Player A=new Player("Sofi");;
private Player B=new Player("RexTheDog");;

void setUp() {

}


        @Test
    void updatePointsOfPlayer() {
        A=new Player("Sofi");
        A.updatePointsOfPlayer(500);
        A.updatePointsOfPlayer(400);

        B.updatePointsOfPlayer(800);
        B.updatePointsOfPlayer(600);
        int a=A.getPoints();
        int b=B.getPoints();
        assertEquals(a,900);
        assertEquals(b,1400);

        }

    @Test
    void correctAnserws() {

        for (int i = 0; i < 5; i++)
        {
            A.correctAnserws();
        }
        int a=A.getCorectA();
        assertEquals(a,5);



        for (int i = 0; i < 9; i++)
        {
            B.correctAnserws();
        }
        int b=B.getCorectA();
        assertEquals(b,9);


    }
}