// Violation: stream() called after close() — use-after-close.
ZipFile zip = new ZipFile(new File("test.zip"));
zip.entries();
zip.close();
zip.stream();   // INVALID: stream() requires opened(zip),
                //          but zip is in state closed
