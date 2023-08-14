package RIBs;
public class ProfileBuilder {
    // Создание компонентов и их связывание
    public static ProfileComponent build(UserData userData) {
        ProfileScreen screen = new ProfileScreen();
        ProfileInteractor interactor = new ProfileInteractor(userData);
        ProfileRouter router = new ProfileRouter();
        return new ProfileComponent(screen, interactor, router);
    }
}

