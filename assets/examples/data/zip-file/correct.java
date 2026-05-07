// Path: opened -> opened -> opened -> closed
ZipFile zip = new ZipFile(new File("test.zip"));
zip.entries();
zip.entries();
zip.close();
