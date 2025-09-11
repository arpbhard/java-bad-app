public void testMd5ValidInput() {
    String input = "Hello, World!";
    String expectedResult = "943a702d06f34599aee1f8da8ef9f729";
    assertEquals(expectedResult, Utils.md5(input));
}