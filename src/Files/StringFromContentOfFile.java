package Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StringFromContentOfFile {

	public static void main(String[] args) throws IOException {
	      String path = System.getProperty("user.dir") + "\\src\\Test.txt";
	        Charset encoding = Charset.defaultCharset();

	        List<String> lines = Files.readAllLines(Paths.get(path), encoding);
	        System.out.println(lines);

	}

}
