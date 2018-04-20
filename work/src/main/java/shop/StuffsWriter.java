package shop;

import java.io.*;
import java.util.List;

public class StuffsWriter {
    public final void writeToFile(final List<Stuff> stuffList) throws IOException {
        File file = new File("C:\\Users\\Severyn\\IdeaProjects\\stuff.csv");
        if(!file.exists()) {
            file.createNewFile();
        }
        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream)) {
            for (Stuff stuff : stuffList) {
                writer.println(stuff.getHeaders());
                writer.println(stuff.toSCV());
            }
            writer.close();
        } catch (IOException e){
            throw e;
        }
    }
}
