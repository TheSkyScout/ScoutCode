//ur package

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigAPI {

    private File file;
    private YamlConfiguration config;

    public  ConfigAPI (File file) {
        this.file = file;
        this.config = YamlConfiguration.loadConfiguration(file);
    }
    public ConfigAPI (String path) {
        this.file = new File(path+".yml");
    }
    public ConfigAPI set(String path, Object obj) {
        config.set(path, obj);
        return this;
    }
    

    public Object get(String path) {
        Object obj = config.get(path);
        return obj;
    }

    public ConfigAPI save() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }
}
