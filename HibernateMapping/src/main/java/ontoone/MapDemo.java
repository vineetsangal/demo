package ontoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	

	public static void main (String[] args) {
		SessionFactory factory = new Configuration().buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(1234);
		q1.setQuestion("What is java");
		
		Answer answer = new Answer();
		answer.setAnswerId(342);
		answer.setAnswer("java is a programming language");
		
		q1.setAnswer(answer);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		tx.commit();
		s.close();
	}

}
