package springCore.Q2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
private int questionId;
private String question;
private List<String> answer1; // answer with list type
private Set<String> answer2; // answer with Set type
private Map<Integer,String> answer3; //answer with Map type
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getAnswer1() {
	return answer1;
}
public void setAnswer1(List<String> answer1) {
	this.answer1 = answer1;
}


public Set<String> getAnswer2() {
	return answer2;
}
public void setAnswer2(Set<String> answer2) {
	this.answer2 = answer2;
}
public Map<Integer, String> getAnswer3() {
	return answer3;
}
public void setAnswer3(Map<Integer, String> answer3) {
	this.answer3 = answer3;
}
public void displayA1() {
	System.out.println("QuestionId: "+ getQuestionId()+" Question : "+getQuestion()+" answer :"+ getAnswer1());
}
public void displayA2() {
	System.out.println("QuestionId: "+ getQuestionId()+" Question : "+getQuestion()+" answer :"+ getAnswer2());
}
public void displayA3() {
	System.out.println("QuestionId: "+ getQuestionId()+" Question : "+getQuestion()+" answer :"+ getAnswer3());
}


}
