import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * κλαση Questions η στην οποια υπαρχουν τα πεδια questions, allCategories.
 * --το πεδιο questions αποθηκευει τα στοιχεια τα οποια ειναι αποθηκευμενα στο αρχειο questions.txt το οποιο περιεχει σε
 * καθε του γραμμη την κατηγορια,την ερωτηση,τις πιθανες απαντησεις και την μοναδικη σωστη απαντηση.Για αυτον ακριβως
 * τον λογο δημιουργειται ArrayList<QuestionAndAnswer> questions ο οποιος περιεχει αντικειμενα QuestionAndAnswer
 *--το πεδιο allCategories αποθηκευει ολες τις κατηγοριες που περιεχονται μεσα στο questions.txt . Ο τροπος με τον
 * οποιο απθηκευονται θα εξεταστει παρακατω.
 */
public class Questions {
    private final ArrayList<QuestionAndAnswer> questions;
    private final HashSet<String> allCategories;

    /**
     * κατασκευαστης Questions
     * κατασκευαζει το πεδιο questions και το πεδιο allCategories
     */

    public Questions(){
        questions = new ArrayList<>();
        allCategories = new HashSet<>();
    }

    public ArrayList<QuestionAndAnswer> getQuestions() {
        return questions;
    }


    /**
     *συναρτηση giveQuestionAndAnswer η οποια επιστρεφει ενα αντικειμενο QuestionAndAnswer που βρισκεται στο πρωτο
     * στοιχειο του ArrayList<QuestionAndAnswer> questions και επειτα το διαγραφει. Αν το ArrayList<QuestionAndAnswer>
     * δεν περιεχει κανενα στοιχειο επιστρεφει null
     * @return ενα αντικειμενο QuestionAndAnswer
     */
    public QuestionAndAnswer giveQuestionAndAnswer(){
        if (questions.size()>0){
            QuestionAndAnswer temp;
            temp= questions.get(0);
            questions.remove(0);
            return temp;
        }
        return null;
    }

    /**
     * Συναρτηση η οποια επιστρεφει ολες τις κατηγοριες ερωτησεων που περιεχονται στο αρχειο questions.txt
     * @return επιστρεφει ολες τις κατηγοριες ερωτησεων που περιεχονται στο αρχειο questions.txt
     */
    public HashSet<String> getAllCategories(){
        return allCategories;
    }

    /**
     * Συναρτηση η οποια διαβαζει τα στοιχεια που περιεχονται στο αρχειο γραμμη - γραμμη  και αναλογα με την μορφη
     * του αρχειου (δηλαδη του πως ακριβως ειναι κατανεμμημενα τα στοιχεια της ερωτησης σε καθε γραμμη του αρχειου)
     * αποθηκευει για την 1η γραμμη την κατηγορια , την ερωτηση, τις απαντησεις , και την μοναδικη σωστη απαντηση και
     * επειτα με αυτα τα στοιχεια δημιουργει ενα νεο αντικειμενο QuestionAndAnswer το οποιο το προσθετει στον
     * ArrayList<QuestionAndAnswer> questions. Το ιδιο κανει και για τη 2η γραμμη και ουτω καθε εξης μεχρι να διαβασει
     * ολο το αρχειο. Δηλαδη αυτη η συναρτηση διαβαζει το αρχειο και αποθηκευει ολες τις δομες ερωτησης (QuestionAndAnswer)
     * στον ArrayList<QuestionAndAnswer> questions.
     * @throws FileNotFoundException
     */
    public void reader() throws FileNotFoundException {

        String fileName = "questions.txt";

        File f = new File(fileName);
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()){
            String s = sc.nextLine();
            String[] all = s.split(",");

            ArrayList<String> answers = new ArrayList<>();
            answers.add(all[2]);
            answers.add(all[3]);
            answers.add(all[4]);
            answers.add(all[5]);


            QuestionAndAnswer x = new QuestionAndAnswer(all[1] , answers , all[6] , all[0]);
            questions.add(x);
            allCategories.add(all[0]);
        }
        Collections.shuffle(questions);

    }
}
