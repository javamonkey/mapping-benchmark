package org.simpleflatmapper.param;

import org.sfm.csv.CsvParser;
import org.sfm.csv.CsvReader;
import org.sfm.csv.CsvWriter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class Csv {


    public static final String url = new String("http://www.maxmind.com/download/worldcities/worldcitiespop.txt.gz");

    public static final String fileName = System.getProperty("java.io.tmpdir") + File.separator + "worldcitiespop.txt";
    public static final String fileNameQuotes = System.getProperty("java.io.tmpdir") + File.separator + "worldcitiespop2.txt";

    public static Reader getReader() throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            byte[] buffer = new byte[4096];
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                 BufferedInputStream bis = new BufferedInputStream(new GZIPInputStream(new URL(url).openStream()))
                ) {
                int l;
                while((l = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, l);
                }
            }
        }
        return new FileReader(file);
    }

    public static Reader getReaderQuotes() throws IOException {
        File file = new File(fileNameQuotes);
        if (!file.exists()) {
            byte[] buffer = new byte[4096];
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                 BufferedInputStream bis = new BufferedInputStream(new GZIPInputStream(new URL(url).openStream()));
                 Writer writer = new OutputStreamWriter(bos)
            ) {



                CsvParser.reader(new InputStreamReader(bis)).read(
                        (row) -> {
                            for(String cell : row) {
                                writer.write("\"");
                                writer.write(cell);
                                writer.write("\",");
                            }
                            writer.write("\n");
                        }

                );
            }
        }
        return new FileReader(file);
    }
}