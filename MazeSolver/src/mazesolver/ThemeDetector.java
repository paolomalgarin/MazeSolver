package mazesolver;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

public class ThemeDetector {
    public interface Advapi32 extends Library {
        Advapi32 INSTANCE = Native.load("advapi32", Advapi32.class);
    }

    public static boolean isDarkModeEnabled() {
        try {
            String registryPath = "Software\\Microsoft\\Windows\\CurrentVersion\\Themes\\Personalize";
            String valueName = "AppsUseLightTheme";
            int value = Advapi32Util.registryGetIntValue(WinReg.HKEY_CURRENT_USER, registryPath, valueName);
            return value == 0; // 0 means dark mode is enabled, 1 means light mode is enabled
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
