import java.io.File;

public class Main {
    public static void main(String[] args) {
//Функционал API для строк:
//        concat(): объединение строк
//        valueOf(): преобразует Object в строковое представление (завязан на toString())
//        join(): объединяет набор строк в одну с учетом разделителя
//        charAt(): получение символа по индексу
//        indexOf(): первый индекс вхождения подстроки
//        lastIndexOf(): последний индекс вхождения подстроки
//        startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
//        replace(): замена одной подстроки на другую
//        trim(): удаляет начальные и конечные пробелы
//        substring(): возвращает подстроку, см.аргументы
//        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
//        сompareTo(): сравнивает две строки
//        equals(): сравнивает строки с учетом регистра
//        equalsIgnoreCase(): сравнивает строки без учета регистра
//        regionMatches(): сравнивает подстроки в строках

        /*String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й*/

//Работа с файловой системой. Файлы
//        Для работы нужно:
//        File <имя> = new File(<полный путь к файлу>);
//        File f1 = new File("file.txt");
//        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath ());
//        // /Users/sk/vscode/java_projects/file.txt
//        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

//Ошибки при работе с файловой системой
//        try {
//            Код, в котором может появиться ошибка
//        } catch (Exception e) {
//            Обработка, если ошибка случилась
//        }
//        finally {
//            Код, который выполнится в любом случае
//        }

//Функционал API для работы с файловой системой:
//        isHidden(): возвращает истину, если каталог или файл является скрытым
//        length(): возвращает размер файла в байтах
//        lastModified(): возвращает время последнего изменения файла или каталога
//        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
//        listFiles(): возвращает массив файлов и подкаталогов, которые находятся
//        в определенном каталоге
//        mkdir(): создает новый каталог
//        renameTo(File dest): переименовывает файл или каталог

//Логирование
//        Использование
//        Logger logger = Logger.getLogger()
//        Уровни важности
//        INFO, DEBUG, ERROR, WARNING и др.
//        Вывод
//        ConsoleHandler info = new ConsoleHandler();
//        log.addHandler(info);
//        Формат вывода: структурированный, абы как*
//        XMLFormatter, SimpleFormatter

    }
}
