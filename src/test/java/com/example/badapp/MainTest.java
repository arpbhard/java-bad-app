public class MainTest {

    @Test
    public void testMainMethodWithNullArg() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[]{null});
        assertEquals("Starting bad Java app...\n", outContent.toString());
        System.setOut(System.out);
    }
}