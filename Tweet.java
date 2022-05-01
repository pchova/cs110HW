package hwAssignments;

/** Polina Chetnikova CS110 Section C
 * Your hwAssignments.Tweet class will contain instance variables for the screen name of the author of the hwAssignments.Tweet,
 * as well as the (text only) content of the hwAssignments.Tweet. The screen name does NOT contain the @ symbol
 * and the content does not contain quotation marks. The hwAssignments.Tweet class has a public class constant,
 * MAX_CHARS set to 140
 */
public class Tweet {
    //instance variables
    private String username;
    private String tweet;

    //class constants
    public final int MAX_CHARS = 140;


    /** A constructor that creates a hwAssignments.Tweet, given the screen name and the content.
     *  If the content is > 140 characters, store only the first 140 characters
     * @param username the online name for the twitter user
     * @param tweet a String holding the contexts of a tweet
     */
    public Tweet(String username, String tweet){
        this.username = username;
        this.tweet = tweet;
        if(tweet.length() >  MAX_CHARS){
                this.tweet = tweet.substring(0,MAX_CHARS);
        }
    }

    /** copy constructor creates a new tweet as a copy of otherTweet
     * @param otherTweet the tweet going to be copied
     */
    public Tweet(Tweet otherTweet){
        this.username = otherTweet.username;
        this.tweet = otherTweet.tweet;
    }

    /** toString( ) method that creates a String
     *  representing a hwAssignments.Tweet as : @DonaldDuck “Disney is the best!”
     *  @return str that contains a tweet with the user and content displayed
     */
     @Override
    public String toString(){
        return String.format("@%s\n " + '"' + "%s" + '"', username, tweet);
    }

    /** setUsername()
     *  @param u set the display name
     */
    public void setUsername(String u){
        username = u;
    }

    /** setTweet()
     *  @param t set the display name
     */
    public void setTweet(String t){
        tweet = t;
    }

    /** getUsername()
     *  @return username linked to twitter account
     */
    public String getUsername(){
        return username;
    }

    /** getTweet
     *  @return contents of the tweet
     */
    public String getTweet(){
        return tweet;
    }

    /** Equals method returns true if two Tweets contain same screen name and content
     *  The parameter to your equals method should be of type Object.
     *  @param other copy object to compare to
     *  @return boolean value determines if two objects are equal
     */
    public boolean equals(Object other){
        Tweet tOther = (Tweet)other;
        return this.username.equals(tOther.username) &&
                this.tweet.equals(tOther.tweet);
    }
}
