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
        friends = new ArrayList<>();
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
    
    public void testData(){
        Friend testFriend1 = createFriend("TestName1", "TestAddress1", "TestPostalCode1", "TestCity1", "TestPhone1");
        
        Friend testFriend2 = createFriend("TestName2", "TestAddress2", "TestPostalCode2", "TestCity2", "TestPhone2");
        
        Friend testFriend3 = createFriend("TestName3", "TestAddress3", "TestPostalCode3", "TestCity3", "TestPhone3");
    }
    
    public Friend createFriend(String name, String address, String postalCode, String city, String phone){
        Friend newFriend = new Friend(name, address, postalCode, city, phone);
        
        friends.add(newFriend);
        
        return newFriend;
    }
    
    public Friend findFriend(String phone){
        String match = "";
        
        for (Friend friend : friends) {
            match = friend.getPhone();
            
            if (match.equals(phone)) {
                return friend;
            }
        }
        
        return null;
    }
    
    public void removeFriendByPhone(String phone) {
        for (Friend friend : friends) {
            if (friend.getPhone().equals(phone)) {
                friends.remove(friend);
            }
        }
    }
}
