package static_keyword;

public class index {
    public static void main(String[] args) {

        Friend myFriend_1 = new Friend("whatever");
        Friend myFriend_2 = new Friend("John");
        Friend myFriend_3 = new Friend("Doctor Strange");
    
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriend();

    }
}


class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriend(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
