public void testMd5NullInput() {
    String input = null;
    String result = Utils.md5(input);
    assertNull(result);
}