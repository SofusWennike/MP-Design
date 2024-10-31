package model;

import java.util.ArrayList;

/**
 * Write a description of class FriendContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Friend> friends;
    private static FriendContainer instance;

    /**
     * Constructor for objects of class FriendContainer
     */
    private FriendContainer()
    {
        // initialise instance variables
        
    }

    public static FriendContainer getInstance() {
        if (instance == null) {
            instance = new FriendContainer();
        }
        
        return instance;
    }
    
    public Friend findFriend(String phone){
        return null;
    }
}
