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
    }
    
    public static FriendContainer getInstance() {
        if (instance == null) {
            instance = new FriendContainer();
        }
        return instance;
    }
    
    public void addFriend(Friend friend){
        friends.add(friend);
    }
    
    public void createFriend(String phone, String postalCode, String address,String name, String city){
        Friend newFriend = new Friend(phone, postalCode, address, name, city);
        
        friends.add(newFriend);
    }
    
    public Friend findFriend(String phone){
        for (Friend friend : friends){
            if (friend.getPhone().equals(phone)){
                return friend;
            }
        }
        return null; //friend not found
    }
}
