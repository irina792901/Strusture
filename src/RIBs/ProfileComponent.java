package RIBs;

class ProfileComponent {
    public final ProfileScreen screen;
    public final ProfileInteractor interactor;
    public final ProfileRouter router;

    public ProfileComponent(ProfileScreen screen, ProfileInteractor interactor, ProfileRouter router) {
        this.screen = screen;
        this.interactor = interactor;
        this.router = router;
    }
}