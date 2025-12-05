public void testMainWithNullUser() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    String[] args = {null};
    Main.main(args);
    assertEquals("Starting bad Java app...\n", outContent.toString());
}