@Test
public void testMainMethodWithNoArguments() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Main.main(new String[]{});
    assertEquals("Starting bad Java app...\n", outContent.toString());
}