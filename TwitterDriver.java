package hwAssignments;

import java.io.*;
import java.util.Scanner;
import java.io.File;
/** Polina Chetnikova CS110
 * Driver class – create hwAssignments.TwitterFeed Obj
 * Weight 5% -- Create hwAssignments.TwitterFeed object (with screen name from file).
 * Driver class – load from file
 * Weight 5% -- read screen name and Tweets from file and load into hwAssignments.TwitterFeed
 * Driver class – toString test
 * Weight 5% -- Demonstrate hwAssignments.TwitterFeed toString( )
 * Driver class – tweetsBy test
 * Weight 5% -- Demonstrate tweetsBy method. Display result well formatted
 */
public class TwitterDriver {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("feed1.txt"));
        String feedOwner;
        TwitterFeed myFeed = null;


        int i = 0;
        //read from a file
        while(scan.hasNextLine()) {
            feedOwner = scan.nextLine();
            myFeed = new TwitterFeed(feedOwner);
        }

        String user = scan.nextLine();
        String tweet = scan.nextLine();
        myFeed.addTweet(user, tweet);

        scan.close();

        System.out.println(myFeed);

        System.out.println(myFeed.toString());
        //System.out.println(myFeed.tweetsBy("mangamangorita"));

    }
}
