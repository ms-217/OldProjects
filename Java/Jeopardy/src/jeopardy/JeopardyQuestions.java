package jeopardy;
/**
 * JeopardyQuestions
 * This class defines the JeopardyQuestions object
 * Note: an object must be created for each question
 */
public class JeopardyQuestions {
    private String catName;
    private int catNum;
    
    /**
     * Constructor.
     * pre: num is a positive integer.
     * post: a JeopardyQuestions object is created.
     * @param name
     * @param num 
     */
    public void JeopardyQuestions(String name, int num) {
        catName = name;
        catNum = num;
    }
    
    /**
     * returns the name of the category.
     * pre: none.
     * post: the category name has been returned.
     * @return catName
     */
    public String getCat() {
        return(catName);
    }