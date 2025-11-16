@Test
public void testMainMethodWithUserArgument() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Main.main(new String[]{"John"});
    assertEquals("Starting bad Java app...\n", outContent.toString());
}