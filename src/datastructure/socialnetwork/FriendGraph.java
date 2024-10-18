package datastructure.socialnetwork;

import java.util.*;

public class FriendGraph {
    private Map<String,User>friendsGraph=new HashMap<>();

    public void addFriend(User user){
        friendsGraph.put(user.getUsername(),user);
    }

   public Set<User> suggestFriends(String username) {
       List<User> friends = friendsGraph.get(username).getFriends();
       Set<User> suggestions = new HashSet<>();
       for (User friend : friends) {
           List<User> friendsOfFriend = friendsGraph.get(friend.getUsername()).getFriends();
           for (User fof : friendsOfFriend) {
               suggestions.add(fof);
           }
           return suggestions;

       }
       return suggestions;
   }

}
