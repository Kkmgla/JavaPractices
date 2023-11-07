import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Введите ваше ИНН (Пример: FR45):");
        String inn = scanner.nextLine();
        check(inn);
    }

    public static void check(String inn){
        try{
            if (Objects.equals(inn, "23")){
                throw new BadINNException("Ваш ИНН просрочен на год");
            }
            else if (Objects.equals(inn, "22")){
                throw new BadINNException2("Ваш ИНН просрочен на два года");
            }
            else{
                System.out.println("Ваш ИНН действителен.");
            }
        }
        catch(Exception e){
            System.out.println("Возникла ошибка: " + e.getMessage());
        } catch (BadINNException e) {
            throw new RuntimeException("Возникла ошибка: " + e.getMessage());
        } catch (BadINNException2 e) {
            throw new RuntimeException("Возникла ошибка: " + e.getMessage());
        }
    }
}