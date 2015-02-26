package com.google.android.exoplayer.demo.nanoHTTPServer;

/**
* @author Paul S. Hawke (paul.hawke@gmail.com)
*         On: 9/14/13 at 8:09 AM
*/
public interface WebServerPluginInfo {
    String[] getMimeTypes();

    String[] getIndexFilesForMimeType(String mime);

    WebServerPlugin getWebServerPlugin(String mimeType);
}