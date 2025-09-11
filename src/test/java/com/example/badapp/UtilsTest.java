public void testMd5ExceptionHandling() {
    String input = "Test";
    String expectedResult = null;
    PowerMockito.mockStatic(java.security.MessageDigest.class);
    PowerMockito.when(java.security.MessageDigest.getInstance("MD5")).thenThrow(new NoSuchAlgorithmException());
    assertEquals(expectedResult, Utils.md5(input));
}