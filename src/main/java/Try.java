import io.reactivex.Observable;

public class Try {
    public static void main(String[] args) {
        getObservable().subscribe(System.out::println);
    }

    private static Observable<Integer> getObservable() {
//        Random random = new Random();
//
//        return Observable.range(0, 10)
//                .concatMap(number -> Observable.just(random.nextLong()).delay(random.nextInt(100), TimeUnit.MILLISECONDS));


        return Observable.create(observer -> {
            observer.onNext(1);
            observer.onNext(2);
            observer.onNext(3);

        });
    }


}
