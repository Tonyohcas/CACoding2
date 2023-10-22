package interface_adapter.clear_users;



import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {
    private final ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void presentText(String message) {
        ClearState clearState = clearViewModel.getState();
        clearState.setMessage(message);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }

}
