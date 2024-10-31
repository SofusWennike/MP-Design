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
    private String phone;
    private FriendContainer friendContainer;
    /**
     * Constructor for objects of class friendController
     */
    public FriendController()
    {
        this.friendContainer = friendContainer.getInstance();
    }

    public Friend findFriend (String phone){
        return friendContainer.findFriend(phone);
    }
    
}
