package RIBs;

public class ProfileInteractor {
    private final UserData userData;

    public ProfileInteractor(UserData userData) {
        this.userData = userData;
    }

    public String getUserName() {
        return userData.getName();
    }

    public int getUserAge() {
        return userData.getAge();
    }

    public String[] getFriendsList() {
        return userData.getFriends();
    }
}
