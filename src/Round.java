/**
 * @author ANNASKARLATOU
 * Αυτη η κλαση αποθηκευει τον αριθμο ερωητσεων που εχουν γινει και τον γυρο που βρισκεται ο παιχτης
 * This class save the number of question which have done.And the number of round which the player is
 **/
public class Round {
    private int round ;
    private int numrQuestions ;

    public Round(){
        round = 5;
        numrQuestions = 4;
    }
    /**η getNumrQuestions επιστρεφει τον αριθμο των ερωτησεων
     * returns the number of questions*/
    public int getNumrQuestions(){
        return numrQuestions;
    }
    /**η getRound επιστρεφει τον γυρο
     * returns the round*/

    public int getRound(){
        return round;
    }

    /**Η μεθοδος NumberRound εμφανιζει τον γυρο που βρισκεται ο παιχτης οταν αυτο γινει 0 τελειωνει το παιχνιδι
     * αλλιως μειωνει κατα 1 και εμφανιζει τον αριθμο τον γυρων
     * The method NumberRound print the round which is the player.When the round is 0 finsh the game
     * if is differnt from 0 reduces -1*/
    public void NumberRound() {
        if (round == 0) {
            System.out.print("GAME OVER");

        } else {
            round -= 1;

        }
    }

    /**Η μεθοδος NumberQuestions εμφανιζει την ερωτηση που βρισκεται ο παιχτης οταν αυτο γινει 0 πηγενει στον επομενο γυρο
     * αλλιως μειωνει κατα 1 και εμφανιζει τον αριθμο τον ερωτησεων που υπολυπονται
     * The method NumberQuestions print the question which is the player.When the round is 0 go to the next round
     * if is differnt from 0 reduces -1*/
    public void NumberQuestions() {
        if ( numrQuestions  == 0) {

            System.out.println("next round");
            NumberRound();

        } else {
            numrQuestions  -= 1;
            System.out.print("You have only ");
            System.out.print( numrQuestions );
            System.out.println(" Questions");
        }
    }}
