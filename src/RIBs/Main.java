package RIBs;

// Main
public class Main {
    public static void main(String[] args) {
        UserData userData = new UserData("John Doe", 30, new String[]{"Alice", "Bob", "Charlie"});
        ProfileComponent profileComponent = ProfileBuilder.build(userData);

        profileComponent.screen.display(userData.getName(), userData.getAge());
        String[] friends = profileComponent.interactor.getFriendsList();
        profileComponent.screen.displayFriendsList(friends);
        profileComponent.router.goToHomeScreen();
        profileComponent.router.logout();
    }
}