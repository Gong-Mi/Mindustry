package mindustry.android;

import android.view.Surface;

public class VulkanBridge {
    static {
        System.loadLibrary("vulkan_renderer");
    }

    public static native boolean initVulkan();
    public static native void setSurface(Surface surface);
}
