import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.observables.ConnectableObservable;

public class TestSum 
{
    public static void main(String[] args)
    {
        ConnectableObservable<String> input = Observable.create(new ObservableOnSubscribe<Object>() {

        });
    }
    
}
