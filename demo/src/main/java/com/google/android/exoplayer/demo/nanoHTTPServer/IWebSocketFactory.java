package com.google.android.exoplayer.demo.nanoHTTPServer;

public interface IWebSocketFactory {
    WebSocket openWebSocket(NanoHTTPD.IHTTPSession handshake);
}
