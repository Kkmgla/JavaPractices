public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
            System.out.println("Successful");
        }catch (NullPointerException e){
            System.out.println("Exception found: " + e.getMessage() + "\n----------------------------------------------------");
        }
        // do something with the key
    }
}
/*Когда исключение перехватывается и обрабатывается в блоке catch,
 нет необходимости объявлять throws NullPointerException в сигнатуре метода.
throws используется для указания, что метод может выбросить исключение,
 но оставляет обработку этого исключения на уровне вызывающего кода.
 В случае, когда исключение обрабатывается внутри метода с помощью try-catch,
 нет необходимости объявлять throws в сигнатуре метода.
Кроме того, NullPointerException является непроверяемым исключением (unchecked exception),
и его обработка не обязательна с помощью throws.
Непроверяемые исключения могут быть обработаны в блоке try-catch,
но вы не обязаны их объявлять в сигнатуре метода или обрабатывать их на уровне вызывающего кода.*/