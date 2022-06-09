import static org.junit.jupiter.api.Assertions.*;

class RoundTest {

  private Round A;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        A=new Round();
    }

    @org.junit.jupiter.api.Test
    void numberRound1() {
        int a=A.getRound();
        A.NumberRound();
        A.NumberRound();
        A.NumberRound();
        A.NumberRound();
       A.NumberRound();
        a=A.getRound();

        assertEquals(a,0);

    }


    @org.junit.jupiter.api.Test
    void numberRound2() {
        int a=A.getRound();
        A.NumberRound();
        A.NumberRound();
        A.NumberRound();
        a=A.getRound();

        assertEquals(a,2);

    }





    @org.junit.jupiter.api.Test
    void numberQuestions() {

        int a=A.getNumrQuestions();
        A.NumberQuestions();
        A.NumberQuestions();
        A.NumberQuestions();
        a=A.getNumrQuestions();

        assertEquals(a,1);

        A.NumberQuestions();

        a=A.getNumrQuestions();

        assertEquals(a,0);
    }
}