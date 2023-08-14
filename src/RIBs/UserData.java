package RIBs;

class UserData {
    private final String name;
    private final int age;
    private final String[] friends;

    public UserData(String name, int age, String[] friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    // Геттеры для получения информации о пользователе
    public String getName() { return name; }
    public int getAge() { return age; }
    public String[] getFriends() { return friends; }
}