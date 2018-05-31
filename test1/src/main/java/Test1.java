import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Test1
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("1", "2", "3");
        Observable<String> observable = Observable.fromIterable(list);
        observable.subscribe(s -> System.out.print(s));
    }
}
