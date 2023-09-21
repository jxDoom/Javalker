import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("hello");
            fileWriter.flush();
        } catch (IOException etyrwety) {
            etyrwety.printStackTrace();

        }

        try {
// Создаем FileHandler, указывая путь к файлу и максимальный размер файла (в байтах)
            FileHandler fileHandler = new FileHandler("mylog.txt");

// Настраиваем формат сообщений
            fileHandler.setFormatter(new SimpleFormatter());

// Устанавливаем FileHandler как обработчик для логгера
            logger.addHandler(fileHandler);

// Устанавливаем уровень логирования (например, ALL, INFO, WARNING, SEVERE и т. д.)
            logger.setLevel(Level.ALL);

// Примеры логирования
            logger.info("This is an informational message.");
            logger.warning("This is a warning message.");
            logger.severe("This is a severe error message.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeFileToText("TEST", 100);
    }

    public static void writeFileToText(String str, int N) {
        try {
            FileWriter fileWriter = new FileWriter("task4.txt");
            for (int i = 0; i < N; i++) {
                fileWriter.write(str + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
