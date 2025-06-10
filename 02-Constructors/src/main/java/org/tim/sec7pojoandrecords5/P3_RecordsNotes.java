package org.tim.sec7pojoandrecords5;

public class P3_RecordsNotes {

    /**
     * ✅ 2. If We Use Record, Do We Still Need config.properties File?
     * Yes ✅. Record just holds the data after it’s loaded.
     *
     * 🔹 Real Flow:
     * You store configs in config.properties (external, editable by QA/DevOps)
     * You load those using Java Properties class
     * Then inject them into your Config record
     * And use this record object across framework.
     *
     * 🔸 Why not hardcode inside record directly?
     * Imagine this:
     * public record Config(String url, String browser) {
     *     // hardcoded values ❌
     * }
     *
     * Now to change url, every QA must touch the Java class — bad practice
     * Properties file allows you to externalize configuration
     * Change values without touching Java code ✅
     *
     * ✅ Summary Answer for Interview:
     * “Records don’t have setters because they are meant to be immutable. In my automation framework,
     * I use config.properties to externalize configurations. Then I load them into a Java record at startup so that the data remains thread-safe,
     * immutable, and cleanly accessible across the framework.
     * Records complement config.properties — not replace it.”
     *
     * ✅ Step-by-step Usage in Framework:
     *
     * 🔹 config.properties:
     * baseURL=https://example.com
     * browser=chrome
     * timeout=15
     * env=QA
     *
     * 🔹 ConfigLoader.java – Utility to load the file:
     *
     * import java.io.FileInputStream;
     * import java.util.Properties;
     *
     * public class ConfigLoader {
     *
     *     private static Config config;
     *
     *     static {
     *         try {
     *             Properties props = new Properties();
     *             props.load(new FileInputStream("config.properties"));
     *
     *             config = new Config(
     *                 props.getProperty("baseURL"),
     *                 props.getProperty("browser"),
     *                 Integer.parseInt(props.getProperty("timeout")),
     *                 props.getProperty("env")
     *             );
     *         } catch (Exception e) {
     *             throw new RuntimeException("Failed to load config: " + e.getMessage());
     *         }
     *     }
     *
     *     public static Config getConfig() {
     *         return config;
     *     }
     * }
     *
     * 🔹 Config.java – ✅ Record to Hold Config Data:
     * public record Config(String baseURL, String browser, int timeout, String env) {
     *     // Optional: you can add custom logic or derived values
     * }
     *
     * 🔹 Usage in Test or Framework Code:
     * public class TestBase {
     *     protected Config config = ConfigLoader.getConfig();
     *
     *     public void setup() {
     *         System.out.println("Base URL: " + config.baseURL());
     *         System.out.println("Timeout: " + config.timeout());
     *         System.out.println("Browser: " + config.browser());
     *     }
     * }
     */
}
