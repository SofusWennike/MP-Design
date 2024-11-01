package controller;
import model.FriendContainer;
import model.Friend;


/**
 * Write a description of class friendController here.
 *
 * @author Mathias, Line og Oli
 * @version 1
 */
public class FriendController
{
    
    /**
     * Constructor for objects of class friendController
     */
    public FriendController()
    {
        
    }

    public Friend findFriend (String phone){
        return FriendContainer.getInstance().findFriend(phone);
    }
    
}
