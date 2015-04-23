package control;
import model.Question;
import model.Answer;

public class post
{
    DBConnect db = new DBConnect();
    Question q = new Question();
    Answer a = new Answer();
    public post()
    {
        //default consructor
    }
    public post(String user_id,String question)
    {
        q.postQuestion(user_id,question);
    }
    public void postA(int qid, String user_id,String answer)
    {
        a.postAnswer(qid, user_id,answer);
    }
}
