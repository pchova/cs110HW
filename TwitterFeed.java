package hwAssignments;

import java.util.ArrayList;
/** Polina Chetnikova CS110 Section C
 *  A hwAssignments.TwitterFeed object will contain the screen name of the owner of the feed, as well as a collection
 *  of Tweets that exist on their feed. The screen name is a String (no @). The list of Tweets is
 *  stored in an ArrayList.
 */
public class TwitterFeed {
    //class constant holds initial capacity of the tweet arrayList
    private final static int INITIAL_CAPACITY = 100;

    //instance variables
    private String username;
    private ArrayList<Tweet> feed;

    /** A constructor that takes a screen name and initializes the feed to be an empty ArrayList
     *  with capacity of 100 (use constant!)
     * @param username initializes the username of twitter account
     */
    public TwitterFeed(String username){
        this.username = username;
        feed = new ArrayList<>(INITIAL_CAPACITY);
    }

    /** A getter for the screen name
     *  @return username of Twitter account
     */
    public String getUserName(){
        return username;
    }

    /** A getter that makes a deep copy of the ArrayList and each hwAssignments.Tweet reference
     *  @return feed arrayList that contains the string of tweets
     */
    public ArrayList<Tweet> getFeed(){
        ArrayList<Tweet> f = new ArrayList<>(INITIAL_CAPACITY);
        for(Tweet t : feed)
            f.add(new Tweet(t));
        return f;
    }

    /** Overloaded method addTweet #1
     *  One takes two strings representing the screen name and content of the hwAssignments.Tweet to add to the end of the feed
     *  @param u String holding the username of Twitter feed
     *  @param t String holding the tweet
     */
    public void addTweet(String u, String t){
        Tweet newTweet = new Tweet(u,t);
        feed.add(newTweet);
    }

    /** Overloaded method addTweet #2
     *  One takes an already created hwAssignments.Tweet and adds it to the end of the feed
     *  @param newTweet already a hwAssignments.Tweet object
     */
    public void addTweet(Tweet newTweet){
        feed.add(newTweet);
    }

    /** toString method that prints the screen name of the owner of the feed,
     *  followed by all Tweets in the feed
     *  @return s with all username and twitter feed
     */
    @Override
    public String toString(){
        String s = getUserName() + "\n";

        //add each tweet as a nl in the string
        for(Tweet t : feed){
            s += String.format(t.toString() + "\n");
        }
        return s;
    }

    /** tweetsBy method that takes a String and returns a collection of Tweets in the feed,
     *  with the screen name specified by the parameter.
     *  For example tf.tweetsBy(“DonaldDuck”) would return an
     *  ArrayList of Tweets in tf that have “DonaldDuck” screen name.
     * @param screenName of twitter user
     * @return byUser returns arraylist<hwAssignments.Tweet> specified by username
     */
     public ArrayList<Tweet> tweetsBy(String screenName){
         ArrayList<Tweet> byUser = new ArrayList<>(INITIAL_CAPACITY);
         for (int i = 0; i < feed.size(); i++) {
             if(feed.get(i).getUsername().equals(screenName)){
                 byUser.add(new Tweet(feed.get(i)));
             }
         }
         return byUser;
     }
}
