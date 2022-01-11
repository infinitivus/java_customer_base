package com.project.infinitivus.customerbase.view.output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author infinitivus
 */
public class Localization {
    public static Map<String, ArrayList<String>> message = new HashMap<>();
    private String path;

    public void installationLanguage(int language) {
        switch (language) {
            case 1:
                path = "src\\main\\java\\com\\project\\"
                        + "infinitivus\\customerbase\\view\\output\\russian.txt";
                break;
            case 2:
                path = "src\\main\\java\\com\\project\\"
                        + "infinitivus\\customerbase\\view\\output\\english.txt";
                break;
        }
        readLanguageFile(path);
    }

    private void readLanguageFile(String path) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(":");
                ArrayList<String> value = new ArrayList(Arrays.asList(array));
                message.put(array[0], value);
            }
        } catch (IOException ex) {
            Logger.getLogger(Localization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
