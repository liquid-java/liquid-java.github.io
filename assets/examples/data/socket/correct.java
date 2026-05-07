// Path: unconnected -> bound -> connected -> inputShutdown -> bothShutdown
Socket s = new Socket();
s.bind(addr);
s.connect(endpoint);
s.shutdownInput();
s.shutdownOutput();
s.close();
