package RIBs;

public class ProfileScreen {
    // Отображение основной информации пользователя
    public void display(String userName, int userAge) {
        System.out.println("Имя: " + userName + ", Возраст: " + userAge);
    }

    // Отображение списка друзей
    public void displayFriendsList(String[] friends) {
        System.out.println("Список друзей:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
