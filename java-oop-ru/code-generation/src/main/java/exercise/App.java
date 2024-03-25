package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    @SneakyThrows
    public static void save(Path path, Car car) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(String.valueOf(path)), car);
    }
    @SneakyThrows
    public static Car extract(Path path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = Files.readString(path);
        return objectMapper.readValue(json, Car.class);
    }
}
// END
