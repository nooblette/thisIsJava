package part03.ch17.sec04.리소스로부터_스트림얻기;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class FileStreamExample {
	public static void main(String[] args) throws URISyntaxException, IOException {
		Path path = Paths.get(Objects.requireNonNull(FileStreamExample.class.getResource("/data.txt")).toURI());
		Stream<String> stringStream = Files.lines(path, Charset.defaultCharset());
		stringStream.forEach(row -> System.out.println(row));
		stringStream.close();

	}
}
