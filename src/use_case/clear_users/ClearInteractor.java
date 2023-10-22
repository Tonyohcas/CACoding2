package use_case.clear_users;

import interface_adapter.clear_users.ClearPresenter;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearUserDataAccessInterface;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        String text = this.clearUserDataAccessInterface.clearUsers();
        this.clearPresenter.presentText(text);
    }
}
